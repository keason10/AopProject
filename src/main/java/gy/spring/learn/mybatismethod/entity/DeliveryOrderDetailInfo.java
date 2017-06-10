package gy.spring.learn.mybatismethod.entity;

import org.apache.ibatis.type.Alias;

/**
 * Created by KEASON on 2017/6/10.
 */
@Alias("DeliveryOrderDetailInfo")
public class DeliveryOrderDetailInfo {
    private Long id;
    private Long pid;
    private Long skuId;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
