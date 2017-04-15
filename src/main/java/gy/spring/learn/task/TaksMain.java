package gy.spring.learn.task;

import gy.spring.learn.utils.TimeUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by yantao on 2017/4/15.
 */
public class TaksMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("task.xml");
        System.out.println("task main start！");
        TimeUtils.showTime();
    }
}
