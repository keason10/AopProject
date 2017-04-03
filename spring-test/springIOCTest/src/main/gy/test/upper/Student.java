package gy.test.upper;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by yantao on 2017/3/24.
 */
@Scope("prototype")
@Service
public class Student {
    private Long id;
    private String name;
    private Hobby hobby;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
