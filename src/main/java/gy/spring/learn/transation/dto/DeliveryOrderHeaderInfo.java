package gy.spring.learn.transation.dto;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by yantao on 2017/4/4.
 */
@Alias("DeliveryOrderHeaderInfo")
public class DeliveryOrderHeaderInfo {
    private Long id;
    private String platformCode;
    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    @Override
    public String toString() {
        return "DeliveryOrderHeaderInfo{" +
                "id=" + id +
                ", platformCode='" + platformCode + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
