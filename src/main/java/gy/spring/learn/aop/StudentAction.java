package gy.spring.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by yantao on 2017/4/3.
 */
public class StudentAction {
    public void showAfter() {
        System.out.println("after show");
    }

    public void showBefore() {
        System.out.println("before show");
    }


    /**
     *
     * @param pjp
     * @return
     * @throws Throwable  注意around 要在pjp.process（）前后进行代码处理
     */
    public Object showAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around show 1");
        Object retVal = pjp.proceed();
        System.out.println("around show 2");
        return retVal;
    }
}
