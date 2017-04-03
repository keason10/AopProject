package gy.spring.learn.aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by yantao on 2017/4/3.
 */
public class StudentTest{

    @Test
    public void showWithGetById() {
        ApplicationContext ct= new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ct.getBean("student", Student.class);
        student.setId(1L);

    }
}