package gy.spring.learn.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by PicaHelth on 2017/7/9.
 */
@Service
public class PlaceholderPropUseImpl {
    @Value("${test.velue}")
    private String testValue;


    public String getTestValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }

    @Override
    public String toString() {
        return "PlaceholderPropUseImpl{" +
                "testValue='" + testValue + '\'' +
                '}';
    }
}