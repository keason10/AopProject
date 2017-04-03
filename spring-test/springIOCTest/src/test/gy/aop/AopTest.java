package gy.aop;

import gy.at.value.AtValueAnno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

/**
 * Created by yantao on 2017/4/3.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AopTest {


    /**
     * 注意aop 设置数值之后，貌似没用呀
     */
    @Test
    public void aopStudentTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        AopStudent aopStudent = ctx.getBean("aopStudent",AopStudent.class);
        aopStudent.setId(1L);
    }

}
