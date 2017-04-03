package gy.at.value;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/4/3.
 */
public class AtValueTest {
    @Test
    public void show() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
        AtValueAnno atValueAnno= cxt.getBean("atValueAnno",AtValueAnno.class);
    }
}
