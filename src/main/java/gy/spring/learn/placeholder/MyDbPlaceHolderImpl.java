package gy.spring.learn.placeholder;

import gy.spring.learn.placeholder.dao.DbPlaceholder;
import gy.spring.learn.placeholder.dto.DbProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.util.CollectionUtils;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * Created by PicaHelth on 2017/7/9.
 */
public class MyDbPlaceHolderImpl extends PropertyPlaceholderConfigurer {
    @Autowired
    private DbPlaceholder dbPlaceholder;

    protected Properties mergeProperties() throws IOException {
        Properties result = new Properties();
        if (this.localOverride) {
            this.loadProperties(result);
        }
        if (this.localProperties != null) {
            Properties[] var2 = this.localProperties;
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                Properties localProp = var2[var4];
                CollectionUtils.mergePropertiesIntoMap(localProp, result);
            }
        }

        if (!this.localOverride) {
            this.loadProperties(result);
        }
        addMyProperties(result);
        return result;
    }

    private void addMyProperties( Properties result) {
        List<DbProperty> list = dbPlaceholder.getAllProperties();
        if (CollectionUtils.isEmpty(list)) {
            return ;
        }
        for (DbProperty prop:list) {
            result.put(prop.getDbkey(),prop.getDbvalue());
        }

    }
}
