package gy.spring.learn.transation.service;

import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;

/**
 * Created by yantao on 2017/4/4.
 */
public interface DeliveryOrderService {
    DeliveryOrderHeaderInfo selectById(Long id);
    Integer updatePlatformCodeById(Long id,String platformCode);
}
