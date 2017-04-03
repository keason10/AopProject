package gy.test.upper.depend.on.depends;

import gy.test.upper.depend.on.depends.HobbyDependOn;
import org.springframework.stereotype.Service;

/**
 * Created by yantao on 2017/3/24.
 */
@Service
public class StudentDependOn {
    public StudentDependOn() {
        System.out.println("StudentDependOn init");
    }

    private Long id;
    private String name;
    private HobbyDependOn hobby;
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

    public void setHobby(HobbyDependOn hobby) {
        this.hobby = hobby;
    }

    public HobbyDependOn getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
