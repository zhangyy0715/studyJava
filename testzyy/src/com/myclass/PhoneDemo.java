package com.myclass;

public class PhoneDemo {
    //测试类，有main方法
    public static void main(String[] args) {
        //创建对象
        Phone p=new Phone();
        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand="小米";
        p.price=2999;
        System.out.println(p.brand);
        System.out.println(p.price);
        //使用成员方法
        p.call();
        p.sendMessage();
    }
}
