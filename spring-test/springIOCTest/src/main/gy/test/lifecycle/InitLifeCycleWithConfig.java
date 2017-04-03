package gy.test.lifecycle;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by yantao on 2017/3/26.
 */
public class InitLifeCycleWithConfig {
    String Name;

    public void setName(String name) {
        Name = name;
    }

    public void afterPropertiesSetMethod() throws Exception {
        System.out.println("InitLifeCycleWithConfig afterPropertiesSetMethod():"+Name);
        if(Name==null){
            throw  new  Exception("name is null");
        }
    }
}
