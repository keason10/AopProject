package gy.spring.learn.aop;

import org.springframework.stereotype.Service;

/**
 * Created by yantao on 2017/4/3.
 */
@Service
public class StudentCommen {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
