package gy.spring.learn.placeholder;

import gy.spring.learn.placeholder.dao.DbPlaceholder;
import gy.spring.learn.placeholder.dto.DbProperty;
import gy.spring.learn.placeholder.jdbc.JDBCUtil;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.CollectionUtils;
import java.io.IOException;
import java.sql.*;
import java.util.*;

/**
 * Created by PicaHelth on 2017/7/9.
 */
public class MyDbPlaceHolderImpl extends PropertyPlaceholderConfigurer {
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
        Connection connection = JDBCUtil.getConnection(result);
        String sql = "select * from p_db_properties";
        List<DbProperty> list = getAll(connection,sql);
        if (CollectionUtils.isEmpty(list)) {
            return ;
        }
        for (DbProperty prop:list) {
            result.put(prop.getDbkey(),prop.getDbvalue());
        }

    }

    private List<DbProperty> getAll(Connection conn,String sql) {
        PreparedStatement pstmt;
        List<DbProperty> list = new ArrayList<>();
        try {
            Map map = new HashMap<String,Integer>();
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                DbProperty dbProperty= new DbProperty();
                dbProperty.setDbkey(rs.getString("dbkey"));
                dbProperty.setDbvalue(rs.getString("dbvalue"));
                dbProperty.setDbenv(rs.getString("dbenv"));
                list.add(dbProperty);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
