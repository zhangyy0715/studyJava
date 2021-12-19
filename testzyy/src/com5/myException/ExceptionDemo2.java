package com5.myException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args){
        System.out.println("开始");
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        method2();
        System.out.println("结束");
    }
    //编译时异常:虽然抛出了，但是调用的时候还是要处理这个异常，向上抛出
    public static void method() throws ParseException {
        String s="2048年08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
    //运行时异常
    public static void method2() throws ArrayIndexOutOfBoundsException{
        int[] arr={1,2,4};
        System.out.println(arr[3]);
    }
}
