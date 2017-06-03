package gy.spring.learn.transation.service.serviceImpl;

import gy.spring.learn.transation.dao.DeliveryOrderHeaderDao;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import gy.spring.learn.transation.service.DeliveryOrderServiceMethod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by KEASON on 2017/6/3.
 */
public class DeliveryOrderServiceMethodImpl implements DeliveryOrderServiceMethod {
    @Autowired
    private DeliveryOrderHeaderDao dao;

    public DeliveryOrderHeaderInfo selectById(@Param("id") Long id) {
        return dao.selectById(id);
    }

    public Integer updatePlatformCodeById(@Param("id") Long id, @Param("platformCode") String platformCode) {
        return dao.updatePlatformCodeById(id,platformCode);
    }

    public Integer updateCodeById(@Param("id") Long id, @Param("code") String code) {
        return dao.updateCodeById(id, code);
    }

    public Integer insertInfo(DeliveryOrderHeaderInfo info) {
        return dao.insertInfo(info);
    }

    public Integer insertLisInfo(List<DeliveryOrderHeaderInfo> infoList) {
        return null;
    }

    public Integer updateInfo(DeliveryOrderHeaderInfo info) {
        return null;
    }

    public Integer updateListInfo(List<DeliveryOrderHeaderInfo> infoList) {
        return null;
    }
}
