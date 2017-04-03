package gy.test.lifecycle;

import gy.test.upper.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by yantao on 2017/3/28.
 */
public class SpringBeanPostProessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if (o instanceof Student) {
            System.out.println("student postProcessBeforeInitialization"+"  String:"+s);
        }
        System.out.println("postProcessBeforeInitialization"+o.toString()+"     String "+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization"+o.toString());
        return o;    }
}
