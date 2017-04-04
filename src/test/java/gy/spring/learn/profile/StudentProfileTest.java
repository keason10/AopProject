package gy.spring.learn.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Properties;

/**
 * Created by yantao on 2017/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:profile.xml")
@ActiveProfiles("demo")
public class StudentProfileTest {
    @Autowired
    StudentProfile studentProfile;

    @Test
    public void show() {
        ApplicationContext ct = new ClassPathXmlApplicationContext("classpath:profile.xml");
        Properties properties = ct.getBean("stg",Properties.class);
        System.out.println(studentProfile.toString());
    }
}
