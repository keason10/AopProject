package gy.test.lifecycle;

import com.alibaba.fastjson.JSONObject;
import gy.test.upper.Student;

import java.util.Objects;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by yantao on 2017/3/28.
 */
public class FactoryBean implements org.springframework.beans.factory.FactoryBean<Student> {
    private   String prop;


    @Override
    public Student getObject() throws Exception {
        Student student = new Student();
        JSONObject object = JSONObject.parseObject(prop);
        student.setName(object.getString("name"));
        student.setId(object.getLong("id"));
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}
