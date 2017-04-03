package gy.spring.learn.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.testng.Assert.*;

/**
 * Created by yantao on 2017/4/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentCommenTest extends AbstractJUnit4SpringContextTests {

    /**
     * 开始报错，这是由于spring-test jar 和srping 的版本不兼容问题，要用相同的版本
     * java.lang.IllegalStateException: Could not load TestContextBootstrapper [null]. Specify @BootstrapWith's 'value' attribute or
     * make the default bootstrapper class available.

     */
    @Autowired
    StudentCommen studentCommen;

    @Test
    public void show(){
        studentCommen.setId(1L);
        studentCommen.setName("1");
        System.out.println("111");
    }

}