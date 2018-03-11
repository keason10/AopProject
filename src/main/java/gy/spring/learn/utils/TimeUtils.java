package gy.spring.learn.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yantao on 2017/4/15.
 */
public class TimeUtils {
    public static void showTime() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    public static void main(String[] args) {
        System.out.println(1==1.00);
    }


}
