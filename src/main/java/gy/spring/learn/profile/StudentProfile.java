package gy.spring.learn.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by yantao on 2017/4/4.
 */
@Service
public class StudentProfile {
    private Long id;
    @Value("${host.url}")
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

    @Override
    public String toString() {
        return "StudentProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
