package gy.spring.learn.transation.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yantao on 2017/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mysql-transation-xml.xml")
@ActiveProfiles("stg")
public class DeliveryOrderServiceXmlTest {
    Logger logger = LoggerFactory.getLogger(DeliveryOrderServiceXmlTest.class);
    @Autowired
    @Qualifier("deliveryOrderServiceXmlImpl")
    DeliveryOrderService deliveryOrderService;

    @Test
    public void updateTest() {
        deliveryOrderService.updatePlatformCodeById(10010101L,"keason9");
    }
}
