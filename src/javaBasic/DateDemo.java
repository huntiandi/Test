package javaBasic;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * zhangyang
 *
 * @date 2021/8/26 11:05
 */


public class DateDemo {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println("date = " + date.toString());
        try {
            Thread.sleep(1000*3);//sleep是Thread的方法，可以在任何地方使用，不会释放锁
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2= new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//MM是月份mm是分钟;HH是24小时hh是12小时
        System.out.println("ft = " + ft.format(date2));//当前时间
    }
}
