package gy.spring.learn.mybatismethod.entity;

import org.apache.ibatis.type.Alias;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by KEASON on 2017/6/10.
 */
@Alias("DeliveryOrderStatusInfo")
public class DeliveryOrderStatusInfo {
    private Long id;
    private DeliveryStatus status;
    private Integer intS;

    public Integer getIntS() {
        return intS;
    }

    public void setIntS(Integer intS) {
        this.intS = intS;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }
}
