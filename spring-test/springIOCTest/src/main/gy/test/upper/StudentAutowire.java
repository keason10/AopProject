package gy.test.upper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by yantao on 2017/3/24.
 */
@Service
public class StudentAutowire {
    private Long id;
    private String name;
    @Autowired
    private Hobby hobby;
    @Autowired
    private Hobby hobby1;

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

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }


    public Hobby getHobby1() {
        return hobby1;
    }

    public void setHobby1(Hobby hobby1) {
        this.hobby1 = hobby1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
