package gy.spring.learn.transation.dao;

import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by yantao on 2017/4/4.
 */
@Repository
public interface DeliveryOrderHeaderDao {
    DeliveryOrderHeaderInfo selectById(@Param("id") Long id);
    Integer updatePlatformCodeById(@Param("id") Long id, @Param("platformCode") String platformCode);
}
