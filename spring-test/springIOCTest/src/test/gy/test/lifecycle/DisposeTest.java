package gy.test.lifecycle;

import gy.test.lifecycle.DisposeLifeCycleWithConfig;
import gy.test.lifecycle.DisposeLifeCycleWithcCode;
import gy.test.lifecycle.InitLifeCycleWithCode;
import gy.test.lifecycle.InitLifeCycleWithConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/3/26.
 */
public class DisposeTest {
    @Test
    public void test() {
        //在web-application 中不用配置，因为spring自动调用destroy methods
        //在non-web-application中需要手动结束，才能调用destroy methods。切记
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        DisposeLifeCycleWithcCode cycleWithCode = ctx.getBean("disposeLifeCycleWithcCode", DisposeLifeCycleWithcCode.class);
        DisposeLifeCycleWithConfig cycleWithConfig = ctx.getBean("disposeLifeCycleWithConfig", DisposeLifeCycleWithConfig.class);
        ctx.registerShutdownHook();
    }

}
