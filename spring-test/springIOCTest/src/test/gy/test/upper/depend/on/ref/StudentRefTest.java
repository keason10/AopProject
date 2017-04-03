package gy.test.upper.depend.on.ref;

import gy.test.upper.depend.on.depends.StudentDependOn;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by yantao on 2017/3/26.
 */
public class StudentRefTest {

    @Test
    public void studentRefTest() {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
        StudentRef studentRef =ct.getBean("studentRef",StudentRef.class);
    }
}