package gy.spring.learn.mybatismethod.impl;

import gy.spring.learn.transation.dao.DeliveryOrderHeaderDao;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import gy.spring.learn.mybatismethod.DeliveryOrderServiceMethod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KEASON on 2017/6/3.
 */
@Service
public class DeliveryOrderServiceMethodImpl implements DeliveryOrderServiceMethod {
    @Autowired
    private DeliveryOrderHeaderDao dao;

    public DeliveryOrderHeaderInfo selectById(Long id) {
        return dao.selectById(id);
    }

    public DeliveryOrderHeaderInfo selectById1(Long id) {
        return dao.selectById1(id);
    }

    public Integer updatePlatformCodeById(Long id,String platformCode) {
        return dao.updatePlatformCodeById(id,platformCode);
    }

    public Integer updateCodeById(Long id,String code) {
        return dao.updateCodeById(id, code);
    }

    public Integer insertInfo(DeliveryOrderHeaderInfo info) {
        return dao.insertInfo(info);
    }

    public Integer insertInfo1(DeliveryOrderHeaderInfo info) {
        return dao.insertInfo1(info);
    }

    public Integer insertLisInfo(List<DeliveryOrderHeaderInfo> infoList) {
        return dao.insertLisInfo(infoList);
    }

    public Integer insertLisInfo1(List<DeliveryOrderHeaderInfo> infoList) {
        return dao.insertLisInfo1(infoList);
    }

    public Integer updateInfo(DeliveryOrderHeaderInfo info) {
        return dao.updateInfo(info);
    }

    public Integer updateInfo3(DeliveryOrderHeaderInfo info) {
        return dao.updateInfo3(info);
    }

    public Integer updateInfo1(Long id, DeliveryOrderHeaderInfo info) {
        return dao.updateInfo1(id, info);
    }

    public Integer updateInfo2(Long id, DeliveryOrderHeaderInfo info) {
        return dao.updateInfo2(id, info);
    }

    public Integer updateListInfo(Integer del, List<DeliveryOrderHeaderInfo> infoList) {
        return dao.updateListInfo(del,infoList);
    }

    public Integer updateListInfo2(Integer del, List<DeliveryOrderHeaderInfo> infoList) {
        return dao.updateListInfo2(del,infoList);
    }

    public Integer updateListInfo3(Integer del, List<DeliveryOrderHeaderInfo> infoList) {
        return dao.updateListInfo3(del,infoList);
    }
}
