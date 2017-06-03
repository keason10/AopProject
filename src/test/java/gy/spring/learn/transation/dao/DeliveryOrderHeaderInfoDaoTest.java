package gy.spring.learn.transation.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    Logger logger = LoggerFactory.getLogger(DeliveryOrderHeaderInfoDaoTest.class);
    @Autowired
    DeliveryOrderHeaderDao deliveryOrderHeaderDao;

    @Test
    public void getById() {
        System.out.println(deliveryOrderHeaderDao.selectById(201706030001L));
    }

    @Test
    public void updateTest() {
        logger.error("1223");
        deliveryOrderHeaderDao.updatePlatformCodeById(10010101L,"keason");
        logger.error("22222");
    }
}
