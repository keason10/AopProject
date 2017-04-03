package gy.test.base.facotry.construct;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/3/24.
 */
public class FactoryTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Factory factory = context.getBean("facotry",Factory.class);
        Factory factoryone = context.getBean("facotry-one",Factory.class);
    }

}