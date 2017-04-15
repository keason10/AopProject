package gy.spring.learn.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yantao on 2017/4/15.
 */
public class TimeUtils {
    public static void showTime() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
