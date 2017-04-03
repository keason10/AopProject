package gy.test.lifecycle;

import org.springframework.beans.factory.DisposableBean;

/**
 * Created by yantao on 2017/3/26.
 */
public class DisposeLifeCycleWithcCode implements DisposableBean {
    String Name;

    public void setName(String name) {
        Name = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposeLifeCycleWithcCode destroy()");
    }
}
