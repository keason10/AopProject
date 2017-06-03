package gy.spring.learn.transation.dao;

import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yantao on 2017/4/4.
 */
@Repository
public interface DeliveryOrderHeaderDao {
    DeliveryOrderHeaderInfo selectById(@Param("id") Long id);
    Integer updatePlatformCodeById(@Param("id") Long id, @Param("platformCode") String platformCode);
    Integer updateCodeById(@Param("id") Long id, @Param("code") String code);
    Integer insertInfo(DeliveryOrderHeaderInfo info);
    Integer insertLisInfo(List<DeliveryOrderHeaderInfo > infoList);
    Integer updateInfo(DeliveryOrderHeaderInfo info);
    Integer updateListInfo(List<DeliveryOrderHeaderInfo > infoList);
}
