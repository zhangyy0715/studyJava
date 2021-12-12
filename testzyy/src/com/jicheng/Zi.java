package com.jicheng;

public class Zi extends Fu {
    //没有构造方法，默认有一个无参构造方法
    public int height = 180;
    public int age=20;
    public void show(){
        int age=10;
        System.out.println(age);
        System.out.println(height);
        //访问本类成员变量age，怎么办呢？
        System.out.println(this.age);
        //访问父类的成员变量age，怎么办呢？
        System.out.println(super.age);
    }
}
