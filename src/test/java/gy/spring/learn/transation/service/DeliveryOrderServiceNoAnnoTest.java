package gy.spring.learn.transation.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yantao on 2017/4/5.
 */
public class DeliveryOrderServiceNoAnnoTest {

    @Test
    public void show() {
        ApplicationContext ct = new ClassPathXmlApplicationContext("mysql-stg.xml");
        DeliveryOrderService service = (DeliveryOrderService)ct.getBean("deliveryOrderServiceImplNoAnno");
        service.updatePlatformCodeById(10010101L,"keason4");
    }
}
