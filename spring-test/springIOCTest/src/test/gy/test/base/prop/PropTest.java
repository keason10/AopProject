package gy.test.base.prop;

import gy.test.base.StudentInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yantao on 2017/3/24.
 */
public class PropTest {
    @Test //使用prop文件进行注入
    public void test1() {
        ApplicationContext cx= new ClassPathXmlApplicationContext("spring.xml");
        StudentInfo studentInfo = cx.getBean("student-prop",StudentInfo.class);
    }
}
