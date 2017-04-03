package gy.test.upper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/3/25.
 */
public class StudentTest {
    @Test
    public void test() {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
        Student student =ct.getBean("autowire-student",Student.class);
    }

    @Test
    public void testAutowireByAnnocation() {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
        StudentAutowire studentAutowire =ct.getBean("autowire-studentAutowire",StudentAutowire.class);
        StudentAutowire studentAutowire_alise =ct.getBean("autowire-studentAutowire-alise",StudentAutowire.class);
        StudentAutowire studentAutowire_alise1 =ct.getBean("autowire-studentAutowire-alise1",StudentAutowire.class);
    }




}