package gy.spring.learn.placeholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by PicaHelth on 2017/7/9.
 */
@ContextConfiguration(locations = {"classpath:placeholder/spring-placeholder.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class placeholderUseImplTest {
    @Autowired
    private PlaceholderUseImpl placeholderUse;
    @Test
    public void shouMyDbString() throws Exception {
        placeholderUse.shouMyDbString();
    }

}