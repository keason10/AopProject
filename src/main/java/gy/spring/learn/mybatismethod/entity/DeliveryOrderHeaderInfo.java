package gy.spring.learn.mybatismethod.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.util.List;

/**
 * Created by KEASON on 2017/6/10.
 */
@Alias("DeliveryOrderHeaderInfoMy")
public class DeliveryOrderHeaderInfo {
    private Long id;
    private String platformCode;
    private Date createDate;
    private String code;
    private DeliveryOrderStatusInfo statusInfo;
    private List<DeliveryOrderDetailInfo> list;

    public DeliveryOrderHeaderInfo() {
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DeliveryOrderStatusInfo getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(DeliveryOrderStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    public List<DeliveryOrderDetailInfo> getList() {
        return list;
    }

    public void setList(List<DeliveryOrderDetailInfo> list) {
        this.list = list;
    }
}
