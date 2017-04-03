package gy.test.lifecycle;

import gy.test.upper.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.LifecycleProcessor;

import javax.annotation.PostConstruct;

/**
 * Created by yantao on 2017/3/26.
 * ApplicationContextAware 可以获取ApplicationContext中的其他bean 和属性
 */
public class InitLifeCycleWithCode implements InitializingBean,LifecycleProcessor,ApplicationContextAware,BeanNameAware {
    String Name;
    ApplicationContext cx;
    String beanName;

    public void setName(String name) {
        Name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitLifeCycleWithCode afterPropertiesSet()："+Name);
    }

    @PostConstruct
    public  void afterPropertiesSetAnno() {
        System.out.println("InitLifeCycleWithCode afterPropertiesSetAnno():"+Name);
    }

    @Override
    public void onRefresh() {
        System.out.println("onRefresh");
    }

    @Override
    public void onClose() {
        System.out.println("onClose");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        cx = applicationContext;
        Student student = cx.getBean("student", Student.class);
        System.out.println(student.toString());
    }

    @Override
    public void setBeanName(String s) {
        beanName =s;
        System.out.println("keason begin to show beanName by Set:"+beanName);
    }
}
