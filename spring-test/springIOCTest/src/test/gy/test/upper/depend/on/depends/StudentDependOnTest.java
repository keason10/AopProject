package gy.test.upper.depend.on.depends;

import gy.test.upper.depend.on.depends.StudentDependOn;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/3/26.
 */
public class StudentDependOnTest {
    @Test
    public void studentDependOnTest() {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
        StudentDependOn studentDependOn =ct.getBean("studentDependOn",StudentDependOn.class);
    }

}