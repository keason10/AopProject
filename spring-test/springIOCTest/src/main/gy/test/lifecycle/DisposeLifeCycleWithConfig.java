package gy.test.lifecycle;

import org.springframework.beans.factory.DisposableBean;

/**
 * Created by yantao on 2017/3/26.
 */
public class DisposeLifeCycleWithConfig {
    String Name;

    public void setName(String name) {
        Name = name;
    }

    public void destroyMethod() throws Exception {
        System.out.println("DisposeLifeCycleWithConfig destroyMethod()");
    }
}
