package gy.test.base;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/3/24.
 */
public class UtilsTest {
    @Test
    public void setUp() throws Exception {
        ApplicationContext cx= new ClassPathXmlApplicationContext("spring.xml");
        Utils utils = cx.getBean("utils",Utils.class);
    }

}