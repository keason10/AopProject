package gy.spring.learn.transation.service.propagation.serviceImpl;

import gy.spring.learn.transation.dao.DeliveryOrderHeaderDao;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yantao on 2017/4/4.
 */
@Service
public class DeliveryOrderServiceAnnoTWOImpl {
    Logger logger = LoggerFactory.getLogger(DeliveryOrderServiceAnnoTWOImpl.class);

    @Autowired
    private DeliveryOrderHeaderDao dao;

    public DeliveryOrderHeaderInfo selectById(Long id) {
        return dao.selectById(id);
    }

    /**
     * In proxy mode (which is the default), only external method calls coming in through the proxy are intercepted.
     * This means that self-invocation, in effect, a method within the target object calling another method of the target object,
     * will not lead to an actual transaction at runtime even if the invoked method is marked with @Transactional.
     * Also, the proxy must be fully initialized to provide the expected behaviour so you should not rely on this
     * feature in your initialization code, * i.e. @PostConstruct.
     */

    @Transactional(rollbackFor = Exception.class)
    public Integer platformCodeUpdateById(Long id, String platformCode) {
        Integer res =  dao.updatePlatformCodeById(id, platformCode);
        return res;

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public Integer codeUpdateCodeById(Long id, String code) {
        Integer res =  dao.updateCodeById(id, code);
        int  i=1/0;
        return res;

    }
}
