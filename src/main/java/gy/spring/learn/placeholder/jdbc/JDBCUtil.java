package gy.spring.learn.placeholder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by PicaHelth on 2017/7/10.
 */
public class JDBCUtil {
    private static Connection conn = null;
    public static Connection getConnection(Properties properties) {
        if (conn !=null) {
            return conn;
        }
        try {
            Class.forName(String.valueOf(properties.get("host.driver"))); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(String.valueOf(properties.get("host.url")), String.valueOf(properties.get("host.username")), String.valueOf(properties.get("host.password")));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
