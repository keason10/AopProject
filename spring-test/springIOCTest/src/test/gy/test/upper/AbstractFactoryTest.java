package gy.test.upper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by yantao on 2017/3/24.
 */
public class AbstractFactoryTest {
    @Test
    public void test() {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
        AbstractFactory abstractFactory=ct.getBean("abstractFactory",AbstractFactory.class);
        abstractFactory.showStudentInfo("==============================");
    }
}
