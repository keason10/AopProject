package gy.spring.learn.mybatismethod;

import gy.spring.learn.mybatismethod.entity.DeliveryOrderStatusInfo;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by KEASON on 2017/6/3.
 */
public interface DeliveryOrderServiceMethod {
    DeliveryOrderHeaderInfo selectById(Long id);
    DeliveryOrderHeaderInfo selectById1(Long id);
    Integer updatePlatformCodeById(Long id,String platformCode);
    Integer updateCodeById(Long id, String code);

    Integer insertInfo(DeliveryOrderHeaderInfo info);
    Integer insertInfo1(DeliveryOrderHeaderInfo info);

    Integer insertLisInfo(List<DeliveryOrderHeaderInfo > infoList);
    Integer insertLisInfo1(List<DeliveryOrderHeaderInfo > infoList);

    Integer updateInfo(DeliveryOrderHeaderInfo info);
    Integer updateInfo3(DeliveryOrderHeaderInfo info);
    //传递2个参数，一个简单类型，一个是符合类型
    Integer updateInfo1(Long id, DeliveryOrderHeaderInfo info);
    Integer updateInfo2(Long id, DeliveryOrderHeaderInfo info);

    Integer updateListInfo(Integer del, List<DeliveryOrderHeaderInfo > infoList);
    Integer updateListInfo2(Integer del, List<DeliveryOrderHeaderInfo > infoList);
    Integer updateListInfo3(Integer del, List<DeliveryOrderHeaderInfo > infoList);

//    批量嵌套查询
    List<DeliveryOrderHeaderInfo> listAllInfo(Long id);
    List<DeliveryOrderHeaderInfo> listAllInfo1(Long id);
    List<DeliveryOrderHeaderInfo> listAllInfo2(Long id);
    List<DeliveryOrderHeaderInfo> listAllInfo3(Long id);

    //更新状态字段
    Integer updateDeliveryStatus(DeliveryOrderStatusInfo info);
}
