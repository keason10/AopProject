package gy.test.lifecycle;

import gy.test.lifecycle.InitLifeCycleWithCode;
import gy.test.lifecycle.InitLifeCycleWithConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/3/26.
 */
public class InitTest {
    @Test
    public void test() {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
        InitLifeCycleWithCode cycleWithCode2=ct.getBean("initLifeCycleWithCode_2",InitLifeCycleWithCode.class);
        InitLifeCycleWithCode cycleWithCode1=ct.getBean("initLifeCycleWithCode_1",InitLifeCycleWithCode.class);
        InitLifeCycleWithCode cycleWithCode=ct.getBean("initLifeCycleWithCode",InitLifeCycleWithCode.class);

        InitLifeCycleWithConfig cycleWithConfig=ct.getBean("initLifeCycleWithConfig", InitLifeCycleWithConfig.class);
    }
}
