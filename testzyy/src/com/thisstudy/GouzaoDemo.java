package com.thisstudy;

public class GouzaoDemo {
    public static void main(String[] args) {
        //StudentGouzao()是调用构造方法
        //无参构造方法创建对象后使用setxxx赋值
        StudentGouzao s = new StudentGouzao();
        s.setName("林青霞");
        s.setAge(30);
        s.show();
        //有参构造方法直接创建带有属性值的对象
        StudentGouzao s1 = new StudentGouzao("zyy",2000);
        s1.show();
    }
}
