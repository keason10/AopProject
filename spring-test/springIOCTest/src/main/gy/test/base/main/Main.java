package gy.test.base.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gy.test.base.StudentInfo;

/**
 * Created by yantao on 2017/3/23.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentInfo studentInfo = context.getBean("student",StudentInfo.class);
    }
}
