package gy.spring.learn.transation.service.serviceImpl;

import gy.spring.learn.transation.dao.DeliveryOrderHeaderDao;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ExceptionDepthComparator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yantao on 2017/4/4.
 */
@Service
public class DeliveryService {

    @Autowired
    private DeliveryOrderHeaderDao dao;

    public DeliveryOrderHeaderInfo selectById(Long id) {
        return dao.selectById(id);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,  noRollbackFor =Exception.class )
    public Integer updatePlatformCodeById(Long id, String platformCode) {
        Integer ret=  dao.updatePlatformCodeById(id, platformCode);
        int i = 1/0;
        return ret;
    }
}
