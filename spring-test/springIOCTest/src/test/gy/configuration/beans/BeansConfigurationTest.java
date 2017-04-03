package gy.configuration.beans;

import gy.configuration.config.BaseConfiguration;
import gy.configuration.scanBeans.ScanImptStudent;
import gy.configuration.scanBeans.ScanStudent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yantao on 2017/4/2.
 */
public class BeansConfigurationTest {

    //单例模式。多例模式
    @Test
    public void getConfigurationStudentTest() {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(BaseConfiguration.class);
        ConfigurationStudent student = ctx.getBean("configurationStudentProtoType",ConfigurationStudent.class);
        ConfigurationStudent student1 = ctx.getBean("configurationStudentProtoType",ConfigurationStudent.class);
        ConfigurationStudent student2 = ctx.getBean("configurationStudentSigton",ConfigurationStudent.class);
        ConfigurationStudent student3 = ctx.getBean("configurationStudentSigton",ConfigurationStudent.class);
    }

    @Test
    public void getConfigurationStudentWihtCtxAnno() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BaseConfiguration.class);
        ScanStudent scanStudent = ctx.getBean("scanStudent-one",ScanStudent.class);
    }

    @Test
    public void getScanStudentWihtCtxAnno() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(BaseConfiguration.class);
        ScanStudent scanStudent = ctx.getBean("scanStudent",ScanStudent.class);
        ScanStudent scanStudent1 = ctx.getBean("scanStudent1",ScanStudent.class);
        System.out.println(scanStudent.toString());
        ctx.registerShutdownHook();
        System.out.println("hehe :"+scanStudent.toString());
        System.out.println("hehe2 :"+scanStudent.toString());
        System.out.println("hehe3 :"+scanStudent.toString());
        System.out.println("hehe4 :"+scanStudent.toString());
        System.out.println("hehe5 :"+scanStudent.toString());
        System.out.println("hehe6 :"+scanStudent.toString());



        /*可以看出只有spring 容器中的对象的引用都不存在时，registerShutdownHook()方法才执行。
            相当于注册了一个监听器，只有spring所有的引用都执行完了，才会调用 destroyMethod*/
    }

    @Test
    public void testBaseConfigurationImpt() {//多个ConfigurationBean 如何合并到一个上边
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(BaseConfiguration.class);
        ScanImptStudent scanImptStudent = ctx.getBean("scanImptStudent",ScanImptStudent.class);
    }


}
