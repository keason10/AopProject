package gy.spring.learn.transation.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yantao on 2017/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mysql-stg.xml")
@ActiveProfiles("stg")
public class DeliveryOrderHeaderInfoDaoTest {
    @Autowired
    DeliveryOrderHeaderDao deliveryOrderHeaderDao;

    @Test
    public void getById() {
        System.out.println(deliveryOrderHeaderDao.selectById(10010101L));
    }

    @Test
    public void updateTest() {
        deliveryOrderHeaderDao.updatePlatformCodeById(10010101L,"keason");
    }
}
