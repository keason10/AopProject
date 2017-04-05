package gy.spring.learn.transation.service.serviceImpl;

import gy.spring.learn.transation.dao.DeliveryOrderHeaderDao;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import gy.spring.learn.transation.service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yantao on 2017/4/4.
 */
@Service
public class DeliveryOrderServiceXmlImpl implements DeliveryOrderService {

    @Autowired
    private DeliveryOrderHeaderDao dao;

    public DeliveryOrderHeaderInfo selectById(Long id) {
        return dao.selectById(id);
    }

    public Integer updatePlatformCodeById(Long id, String platformCode) {
        Integer res =  dao.updatePlatformCodeById(id, platformCode);
        int h =1/0;
        return res+h;
    }
}
