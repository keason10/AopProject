package gy.spring.learn.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.Locale;

import static com.sun.prism.shape.ShapeRep.InvalidationType.LOCATION;
import static org.testng.Assert.*;

/**
 * Created by keason on 2017/8/2.
 */
public class PlaceholderPropUseImplTest {

    @Test
    public void testToString() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:placeholder/spring-placeholderProp.xml");
        MessageSource messageSource = (MessageSource) applicationContext.getBean("messageSource");
        while (true) {
            System.out.println(messageSource.getMessage("test.velue",new Object[0], Locale.CHINA));
            Thread.currentThread().sleep(5000);
        }
    }

}