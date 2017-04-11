package gy.spring.learn.transation.service.serviceImpl;

import gy.spring.learn.transation.dao.DeliveryOrderHeaderDao;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import gy.spring.learn.transation.service.DeliveryOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * Created by yantao on 2017/4/4.
 */
@Service
public class DeliveryOrderServiceAnnoImpl implements DeliveryOrderService {
    Logger logger = LoggerFactory.getLogger(DeliveryOrderServiceAnnoImpl.class);

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
    public Integer updatePlatformCodeById(Long id, String platformCode) {
        logger.error(" before error 0");
        logger.warn("before warn 0");
        logger.info("before info 0");
        logger.debug("before debug 0");
        logger.trace("before trace 0");
        Integer res =  dao.updatePlatformCodeById(id, platformCode);

        logger.error("after error 0");
        logger.warn("after warn 0");
        logger.info("after info 0");
        logger.debug("after debug 0");
        logger.trace("after trace 0");
        int h =1/0;
        return res+h;

    }
}
