package gy.aop;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by yantao on 2017/4/3.
 */
public class AopStudent {
    private   Long id;
    private String Name ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
