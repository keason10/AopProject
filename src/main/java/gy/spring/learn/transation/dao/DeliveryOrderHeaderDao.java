package gy.spring.learn.transation.dao;

import gy.spring.learn.mybatismethod.entity.DeliveryOrderStatusInfo;
import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yantao on 2017/4/4.
 */
@Repository
public interface DeliveryOrderHeaderDao {
    DeliveryOrderHeaderInfo selectById(@Param("id")Long id);
    //通过sql ,include 属性 定义数据库的库，数据库的表变量
    DeliveryOrderHeaderInfo selectById1(@Param("id")Long id);

    Integer updatePlatformCodeById(@Param("id")Long id, @Param("platformCode")String platformCode);
    Integer updateCodeById(@Param("id")Long id, @Param("code")String code);

    //用@Param,需要在应用值的时候加 #{info.id},不用@param 则不用加#{info}
    Integer insertInfo(@Param("info")DeliveryOrderHeaderInfo info);
    Integer insertInfo1(DeliveryOrderHeaderInfo info);

    // foreach 不能用于最外层，会报错的。insertLisInfo1
    Integer insertLisInfo(@Param("infoList")List<DeliveryOrderHeaderInfo > infoList);
    Integer insertLisInfo1(@Param("infoList")List<DeliveryOrderHeaderInfo > infoList);

    //不用注解，注意在test的时候“不用”加前缀info
    Integer updateInfo(DeliveryOrderHeaderInfo info);
    //用注解，注意在test的时候“一定”要加前缀info
    Integer updateInfo3(@Param("info") DeliveryOrderHeaderInfo info);
    //用注解，注意在test的时候“要加”前缀info
    Integer updateInfo1(@Param("id")Long id,@Param("info")DeliveryOrderHeaderInfo info);
    //不用注解，mybatis 自动映射参数为param1，param2.。注意在test的时候要加前缀param2.platformCode
    Integer updateInfo2(Long id,DeliveryOrderHeaderInfo info);

    //foreach 不能用于最外层，会报错的。例如updateListInfo2/updateListInfo3
    Integer updateListInfo(@Param("del")Integer del, @Param("infoList") List<DeliveryOrderHeaderInfo > infoList);
    Integer updateListInfo2(@Param("del")Integer del, @Param("infoList") List<DeliveryOrderHeaderInfo > infoList);
    Integer updateListInfo3(@Param("del")Integer del, @Param("infoList") List<DeliveryOrderHeaderInfo > infoList);


    List<DeliveryOrderHeaderInfo> listAllInfo(@Param("id") Long Id);
    List<DeliveryOrderHeaderInfo> listAllInfo1(@Param("id") Long Id);
    List<DeliveryOrderHeaderInfo> listAllInfo2(@Param("id") Long Id);
    List<DeliveryOrderHeaderInfo> listAllInfo3(@Param("id") Long Id);

    Integer updateDeliveryStatus(DeliveryOrderStatusInfo info);
}
