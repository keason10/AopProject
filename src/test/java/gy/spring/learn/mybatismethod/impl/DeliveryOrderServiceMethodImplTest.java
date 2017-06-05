package gy.spring.learn.mybatismethod.impl;

import gy.spring.learn.transation.dto.DeliveryOrderHeaderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by KEASON on 2017/6/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mysql-stg.xml")
public class DeliveryOrderServiceMethodImplTest{
    @Autowired
    DeliveryOrderServiceMethodImpl serviceMethod;

    @Test
    public void selectById() throws Exception {
        serviceMethod.selectById(201706040001L);
    }

    @Test
    public void selectById1() throws Exception {
        serviceMethod.selectById1(201706040001L);
    }

    @Test
    public void updatePlatformCodeById() throws Exception {

    }

    @Test
    public void updateCodeById() throws Exception {

    }

    @Test
    public void insertInfo() throws Exception {
        DeliveryOrderHeaderInfo info = new DeliveryOrderHeaderInfo();
        info.setId(201706040001L);
        info.setPlatformCode("P201706040001");
        info.setCode("C201706040001");
        serviceMethod.insertInfo(info);
    }

    @Test
    public void insertInfo1() throws Exception {
        DeliveryOrderHeaderInfo info = new DeliveryOrderHeaderInfo();
        info.setId(201706040002L);
        info.setPlatformCode("P201706040002");
        info.setCode("C201706040002");
        serviceMethod.insertInfo1(info);
    }

    @Test
    public void insertLisInfo() throws Exception {
        List<DeliveryOrderHeaderInfo> list  = new ArrayList<DeliveryOrderHeaderInfo>();
        list.add(new DeliveryOrderHeaderInfo(201706040003L,"P201706040003","C201706040003"));
        list.add(new DeliveryOrderHeaderInfo(201706040004L,"P201706040004","C201706040004"));
        serviceMethod.insertLisInfo(list);
    }

    @Test
    public void insertLisInfo1() throws Exception {
        List<DeliveryOrderHeaderInfo> list  = new ArrayList<DeliveryOrderHeaderInfo>();
        list.add(new DeliveryOrderHeaderInfo(201706040004L,"P201706040004","C201706040004"));
        list.add(new DeliveryOrderHeaderInfo(201706040005L,"P201706040005","C201706040005"));
        serviceMethod.insertLisInfo1(list);
    }

    @Test
    public void updateInfo() throws Exception {
        DeliveryOrderHeaderInfo info =  new DeliveryOrderHeaderInfo(201706040003L,"PP201706040003","CC201706040003");
        serviceMethod.updateInfo(info);
    }

    @Test
    public void updateInfo3() throws Exception {
        DeliveryOrderHeaderInfo info =  new DeliveryOrderHeaderInfo(201706040003L,"PP20170604000303","CC20170604000303");
        serviceMethod.updateInfo3(info);
    }

    @Test
    public void updateInfo1() throws Exception {
        DeliveryOrderHeaderInfo info =  new DeliveryOrderHeaderInfo(201706040003L,"PPP20170604000301","CCC20170604000301");
        serviceMethod.updateInfo1(201706040003L, info);
    }
    @Test
    public void updateInfo2() throws Exception {
        DeliveryOrderHeaderInfo info =  new DeliveryOrderHeaderInfo(201706040003L,"PPP20170604000302","CCC20170604000302");
        serviceMethod.updateInfo2(201706040003L, info);
    }

    @Test
    public void updateListInfo() throws Exception {
        List<DeliveryOrderHeaderInfo> list  = new ArrayList<DeliveryOrderHeaderInfo>();
//        list.add(new DeliveryOrderHeaderInfo(201706040005L,"P201706040005","C201706040005"));
//        list.add(new DeliveryOrderHeaderInfo(201706040006L,"P201706040006","C201706040006"));
//        serviceMethod.insertLisInfo(list);
        list.clear();
        list.add(new DeliveryOrderHeaderInfo(201706040005L,"UP201706040005","UC201706040005"));
        list.add(new DeliveryOrderHeaderInfo(201706040006L,"UP201706040006","UC201706040006"));
        serviceMethod.updateListInfo(0,list);
    }

    @Test
    public void updateListInfo2() throws Exception {
        List<DeliveryOrderHeaderInfo> list  = new ArrayList<DeliveryOrderHeaderInfo>();
        list.clear();
        list.add(new DeliveryOrderHeaderInfo(201706040005L,"UP20170604000502","UC20170604000502"));
        list.add(new DeliveryOrderHeaderInfo(201706040006L,"UP20170604000602","UC20170604000602"));
        serviceMethod.updateListInfo2(0,list);
    }

    @Test
    public void updateListInfo3() throws Exception {
        List<DeliveryOrderHeaderInfo> list  = new ArrayList<DeliveryOrderHeaderInfo>();
        list.clear();
        list.add(new DeliveryOrderHeaderInfo(201706040005L,"UP20170604000503","UC20170604000503"));
        list.add(new DeliveryOrderHeaderInfo(201706040006L,"UP20170604000603","UC20170604000603"));
        serviceMethod.updateListInfo3(0,list);
    }

}