package com4.myDate2;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();
        String s = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);


        //日期字符串
        String s1="2021年12月19日 21:54:28";
        Date d1 = DateUtils.stringToDate(s1, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(d1);//最后解析成了日期格式
    }
}
