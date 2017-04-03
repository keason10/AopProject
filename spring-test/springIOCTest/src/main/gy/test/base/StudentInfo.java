package gy.test.base;

import gy.test.upper.Hobby;
import org.springframework.stereotype.Service;

/**
 * Created by yantao on 2017/3/23.
 */
@Service
public class StudentInfo {
    private Long id;
    private String name;
    private Hobby hobby;
    public StudentInfo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentInfo() {
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

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
