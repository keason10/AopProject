package gy.spring.learn.transation.service;

import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by KEASON on 2017/6/3.
 */
public interface DeliveryOrderServiceMethod {
    DeliveryOrderHeaderInfo selectById(@Param("id") Long id);
    Integer updatePlatformCodeById(@Param("id") Long id, @Param("platformCode") String platformCode);
    Integer updateCodeById(@Param("id") Long id, @Param("code") String code);
    Integer insertInfo(DeliveryOrderHeaderInfo info);
    Integer insertLisInfo(List<DeliveryOrderHeaderInfo > infoList);
    Integer updateInfo(DeliveryOrderHeaderInfo info);
    Integer updateListInfo(List<DeliveryOrderHeaderInfo > infoList);
}
