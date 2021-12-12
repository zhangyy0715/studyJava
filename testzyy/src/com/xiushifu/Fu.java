package com.xiushifu;

//类也不能加final修饰，加了就不能被继承了
public class Fu {
    public void show(){
        System.out.println("父类show");
    }
//    若下面这样写报错
//    public final void show(){
//        System.out.println("父类show");
//    }
}
