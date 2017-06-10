package gy.spring.learn.mybatismethod.entity;

import org.apache.ibatis.type.Alias;

/**
 * Created by KEASON on 2017/6/10.
 */
@Alias("DeliveryStatus")
public enum  DeliveryStatus implements BaseEnum {
    DELIVERY_WAIT(0,"待发货"),
    DELIVERY_ING(1,"发货中"),
    DELIVERY_SUCCESS(2,"发货成功"),
    DELIVERY_FAIL(-1,"发货失败");

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getText() {
        return text;
    }

    DeliveryStatus(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

    private Integer value;
    private String text;



    public static DeliveryStatus valueOf(Integer value){
        if(value==null){
            return DELIVERY_WAIT;
        }
        for (DeliveryStatus s :DeliveryStatus.values()) {
            if(s.getValue().equals(value)){
                return s;
            }
        }
        return DELIVERY_WAIT;
    }
}
