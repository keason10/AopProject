package gy.spring.learn.transation.service;

import gy.spring.learn.transation.service.propagation.serviceImpl.DeliveryOrderPropagationServiceImpl;
import gy.spring.learn.transation.service.propagation.serviceImpl.DeliveryOrderServiceAnnoOneImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yantao on 2017/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mysql-transation-anno.xml")
@ActiveProfiles("stg")
public class DeliveryOrderServiceAnnoTest {
    @Autowired
    @Qualifier("deliveryOrderServiceAnnoImpl")
    DeliveryOrderService deliveryOrderService;

    @Autowired
    @Qualifier("deliveryOrderServiceAnnoOneImpl")
    DeliveryOrderServiceAnnoOneImpl deliveryOrderServiceAnnoOneImpl;

    @Autowired
    @Qualifier("deliveryOrderPropagationServiceImpl")
    DeliveryOrderPropagationServiceImpl deliveryOrderPropagationServiceImpl;

    @Test
    public void updateTest() {
        deliveryOrderService.updatePlatformCodeById(10010101L,"keason4");
    }

    @Test
    public void updatePropagationOneTest() {
        deliveryOrderServiceAnnoOneImpl.platformCodeUpdateById(10010101L,"keason4");
    }

    @Test
    public void codeUpdateCodeByIdTest() {
        deliveryOrderServiceAnnoOneImpl.codeUpdateCodeById(10010101L,"code0001");
    }

    @Test
    public void updatePropagationTest() {
        deliveryOrderPropagationServiceImpl.updatePlatformCodeById(10010101L,"keason0009");
    }
}
