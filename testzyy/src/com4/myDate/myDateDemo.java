package com4.myDate;

import java.util.Date;

public class myDateDemo {
    public static void main(String[] args) {

        //无参构造方法
        Date d1=new Date();
        System.out.println(d1);//Sun Dec 19 21:04:30 CST 2021重写了toString方法

        //有参构造方法
        long date = 1000*60*60;
        Date d2=new Date(date);
        System.out.println(d2);

        //成员方法1：getTime()
        System.out.println(d1.getTime()*1.0/1000/60/60/24/365);

        //成员方法2：setTime()
//        long time=1000*60*60;
        long time=System.currentTimeMillis();
        d1.setTime(time);
        System.out.println(d1);

    }
}
