package gy.test.base;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/3/23.
 */
public class StudentInfoTest {
    @Test // 使用@Service注解
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentInfo studentInfo = context.getBean("studentInfo",StudentInfo.class);
    }

    @Test//使用xml:p 元素
    public void test2() {
        ApplicationContext cx= new ClassPathXmlApplicationContext("spring.xml");
        StudentInfo studentInfo = cx.getBean("p-studentInfo",StudentInfo.class);
    }

    @Test//使用xml:c 元素
    public void test3() {
        ApplicationContext cx= new ClassPathXmlApplicationContext("spring.xml");
        StudentInfo studentInfo = cx.getBean("c-studentInfo",StudentInfo.class);
    }
}