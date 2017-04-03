package gy.spring.learn.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.testng.Assert.*;

/**
 * Created by yantao on 2017/4/3.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentCommenTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    StudentCommen studentCommen;

    @Test
    public void show(){
        studentCommen.setId(1L);
        studentCommen.setName("1");
        System.out.println("111");
    }

}