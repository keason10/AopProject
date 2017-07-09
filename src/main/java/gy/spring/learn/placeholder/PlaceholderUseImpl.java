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
    @Autowired
    private DbPlaceholder dbPlaceholder;

    @Value("${id}")
    private String id;

    @Value("${name}")
    private String name;

    public void shouMyDbString() {
        System.out.println("id");
        System.out.println(JSON.toJSONString(dbPlaceholder.getAllProperties()));
        System.out.println(this.id);
    }

}
