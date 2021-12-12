package com.myInterface;

public class JumppingDemo {
    public static void main(String[] args) {
        //通过实现类来实例化接口
        Jumpping j=new Cat();
        j.jump();
        System.out.println(j.num);
        System.out.println(j.num1);
    }
}
