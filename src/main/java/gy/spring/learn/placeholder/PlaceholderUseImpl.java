package gy.spring.learn.placeholder;

import com.alibaba.fastjson.JSON;
import gy.spring.learn.placeholder.dao.DbPlaceholder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by PicaHelth on 2017/7/9.
 */
@Service
public class PlaceholderUseImpl {
    @Value("${id}")
    private String id;

    @Value("${name}")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shouMyDbString() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "PlaceholderUseImpl{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
