package gy.spring.learn.placeholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by PicaHelth on 2017/7/9.
 */
public class placeholderUseImplTest {

    //模拟全局的环境变量
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:placeholder/spring-placeholder.xml");
    PlaceholderUseImpl placeholderUse = applicationContext.getBean("placeholderUseImpl",PlaceholderUseImpl.class);

    @Test
    public void shouMyDbString() throws Exception {
        placeholderUse.shouMyDbString();

//        模拟刷新
        this.getRefreshBeans();
        placeholderUse.shouMyDbString();
    }


    private void getRefreshBeans() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:placeholder/spring-placeholder.xml");
        placeholderUse = applicationContext.getBean("placeholderUseImpl",PlaceholderUseImpl.class);
    }

}