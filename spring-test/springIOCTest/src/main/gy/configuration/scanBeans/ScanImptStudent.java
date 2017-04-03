package gy.configuration.scanBeans;

import org.springframework.stereotype.Component;

/**
 * Created by yantao on 2017/4/2.
 */
@Component("scanImptStudent")
public class ScanImptStudent {
    private Long id;
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

    public void init() {
        this.id =1L;
        this.Name="1";
    }

    public void distory() {
        this.id = null;
        this.Name = null;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ScanStudent{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}

