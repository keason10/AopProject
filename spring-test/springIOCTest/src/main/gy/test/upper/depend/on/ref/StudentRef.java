package gy.test.upper.depend.on.ref;

import gy.test.upper.depend.on.depends.HobbyDependOn;
import org.springframework.stereotype.Service;

/**
 * Created by yantao on 2017/3/24.
 */
@Service
public class StudentRef {
    public StudentRef() {
        System.out.println("StudentRef init");
    }

    private Long id;
    private String name;
    private HobbyRef hobby;
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

    public HobbyRef getHobby() {
        return hobby;
    }

    public void setHobby(HobbyRef hobby) {
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
