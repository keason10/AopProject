package gy.spring.learn.transation.service.propagation.serviceImpl;

import gy.spring.learn.transation.dao.DeliveryOrderHeaderDao;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import gy.spring.learn.transation.service.DeliveryOrderPropagationService;
import gy.spring.learn.transation.service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yantao on 2017/4/4.
 * sql:
     SELECT  * FROM erp_tc.`delivery_order_header` WHERE id =10010101 OR id =10010102;
     UPDATE erp_tc.delivery_order_header SET CODE = 'code', platform_code='keason' WHERE id =10010101 OR id =10010102;

 事物传播属性：
     REQUIRED：指定当前方法必需在事务环境中运行，如果当前有事务环境就加入当前正在执行的事务环境，如果当前没有事务，就新建一个事务。这是默认值。
     SUPPORTS：指定当前方法加入当前事务环境，如果当前没有事务，就以非事务方式执行。
     MANDATORY：指定当前方法必须加入当前事务环境，如果当前没有事务，就抛出异常。
     REQUIRES_NEW：指定当前方法总是会为自己发起一个新的事务，如果发现当前方法已运行在一个事务中,则原有事务被挂起,自己创建一个属于自己的事务,
     一直我自己这个方法commit结束,原先的事务才会恢复执行。
     NOT_SUPPORTED：指定当前方法以非事务方式执行操作，如果当前存在事务，就把当前事务挂起，等我以非事务的状态运行完，再继续原来的事务。
     NEVER：指定当前方法绝对不能在事务范围内执行，如果方法在某个事务范围内执行，容器就抛异常，只有没关联到事务，才正常执行。
     NESTED：指定当前方法执行时， 如果已经有一个事务存在,则运行在这个嵌套的事务中.如果当前环境没有运行的事务，就新建一个事务，
     并与父事务相互独立，这个事务拥有多个可以回滚的保证点。就是指我自己内部事务回滚不会对外部事务造成影响，只对DataSourceTransactionManager事务管理器起效。

 事物的默认值：
     Propagation setting is REQUIRED.
     Isolation level is DEFAULT.
     Transaction is read/write.
     Transaction timeout defaults to the default timeout of the underlying transaction system, or none if timeouts are not supported.
     Any RuntimeException triggers rollback, and any checked Exception does not.

 关于事物自己的测试
    0, 在一个事物中，如果用try catch 包含代码，异常被捕获，则事物是不会被回滚的。

    1、在同一个Service 中，第一个事物调用第二个事物，不管事物是什么类型，事物的传播属性没用.
        但是在【【spring 4.3】】之后的版本，可以使用 @Autowired 在service中关联自身，实现事物传播。不能用@Resource.
        详情参考：7.9.4 Fine-tuning annotation-based autowiring with qualifiers

    2，在一个同一个service 中，由非事物方法调用事物方法，会导致事物方法失效。
    3、service1.trans REQUIRED  调用 service2.trans REQUIRED。service2.trans 报异常，但是在service1.trans 中try catch 捕获了此异常，
     service1.trans 仍然会回滚，此时报“UnexpectedRollbackException” 异常。
    4、service1.trans 调用 service2.trans REQUIRES_NEW。service2.trans 报异常，service1.trans 回滚与否，只和service1.trans 上下文有关，他们是隔离的，
    5、
 */
@Service
public class DeliveryOrderPropagationServiceImpl{

    @Autowired
    private DeliveryOrderHeaderDao dao;
    @Qualifier("deliveryOrderPropagationServiceImpl")
    DeliveryOrderPropagationServiceImpl service;

    public DeliveryOrderHeaderInfo selectById(Long id) {
        return dao.selectById(id);
    }

    @Transactional(value = "txOne", rollbackFor = Exception.class)
    public Integer updatePlatformCodeById(Long id, String platformCode) {
        Integer res =  dao.updatePlatformCodeById(id, platformCode);
        // 同一个Service 中的不同transation 之间调用，都会当成一个transation 处理，没有事物传播属性的概念
        service.updatePlatformCodeByIdA(10010102L, "code0009");
        int h =1/0;
        return res+h;
    }

    @Transactional(value = "txTwo",propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public Integer updatePlatformCodeByIdA(Long id, String platformCode)  {
        Integer res =  dao.updateCodeById(id, platformCode);
        return res;
    }

}
