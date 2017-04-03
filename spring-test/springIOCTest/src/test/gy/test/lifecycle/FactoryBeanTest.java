package gy.test.lifecycle;

import gy.test.base.StudentInfo;
import gy.test.upper.Student;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static javafx.scene.input.KeyCode.T;
import static org.junit.Assert.*;

/**
 * Created by yantao on 2017/3/28.
 */
public class FactoryBeanTest {
    @Test
    public void test() {
        //要获取原来bean  必须用&
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        FactoryBean factoryBean = context.getBean("&factoryBeanWithStudent",FactoryBean.class);
        try {
            Student student = factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        //直接获取的是工厂方法getObject() 的返回Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = context.getBean("factoryBeanWithStudent",Student.class);
    }
}