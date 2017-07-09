package gy.spring.learn.placeholder.dto;

import org.apache.ibatis.type.Alias;

/**
 * Created by PicaHelth on 2017/7/9.
 */
@Alias("DbProperty")
public class DbProperty {
    private String dbkey;
    private String dbvalue;
    private String dbenv;

    public String getDbkey() {
        return dbkey;
    }

    public void setDbkey(String dbkey) {
        this.dbkey = dbkey;
    }

    public String getDbvalue() {
        return dbvalue;
    }

    public void setDbvalue(String dbvalue) {
        this.dbvalue = dbvalue;
    }

    public String getDbenv() {
        return dbenv;
    }

    public void setDbenv(String dbenv) {
        this.dbenv = dbenv;
    }
}
