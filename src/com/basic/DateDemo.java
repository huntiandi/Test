package com.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * zhangyang
 *
 * @date 2021/8/26 11:05
 */


public class DateDemo {
    public static void main(String[] args) {
        //Date类
        Date date= new Date();
        System.out.println("date = " + date.toString());
        try {
            Thread.sleep(1000*1);//sleep是Thread的方法，可以在任何地方使用，不会释放锁
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2= new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM是月份mm是分钟;HH是24小时hh是12小时
        System.out.println("ft = " + ft.format(date2));//当前时间

        //Calendar 只能通过getInstance来获取当前时间，可以进行简单的日期运算，可以对其clear清空，再set 设置特定的日期
        Calendar ca = Calendar.getInstance();
        int Y = ca.get(Calendar.YEAR);
        int M = ca.get(Calendar.MONTH)+1;
        int D = ca.get(Calendar.DAY_OF_MONTH);
        int W = ca.get(Calendar.DAY_OF_WEEK)-1;//1~7 周日~周六
        int H = ca.get(Calendar.HOUR_OF_DAY);
        int MM = ca.get(Calendar.MINUTE);
        int S = ca.get(Calendar.SECOND);
        int MS = ca.get(Calendar.MILLISECOND);
        System.out.println("Calendar："+Y + "-" +M +"-" + D +" 周" + W +"  " + H +":" +MM + ":" +S + ":" +MS);
        System.out.println("ca.getTime() = " + ca.getTime());//将calendar转换成date

        //TimeZone多了失去转换的功能
        TimeZone tzDefault = TimeZone.getDefault(); // 当前时区
        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00"); // GMT+9:00时区
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York"); // 纽约时区
        System.out.println("当前时区："+tzDefault.getID()); // Asia/Shanghai
        System.out.println("GMT+9:00时区："+tzGMT9.getID()); // GMT+09:00
        System.out.println("newyork："+tzNY.getID()); // America/New_York
    }
}
