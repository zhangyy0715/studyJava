package com.xiushifu;

public class Zi extends Fu {
    public int age=20;
//    若这样写报错，age被final修饰了就不能改了
//    public final int age=20;
    public void method(){
        age=30;
        System.out.println("子类method "+age);
    }
    @Override
    public void show(){
        super.show();
        System.out.println("我就是重写了一下");
    }
}
