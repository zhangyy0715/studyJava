package com.xiushifu;

public class FfinalDemo {
    //final修饰引用变量
    //student是地址值，s修饰的是一个地址，地址不能变，不能Student student = new Student();
    //但是地址里面的内容是可以变的
    public static void main(String[] args) {
        final Student student = new Student();
        student.age = 300;
        System.out.println(student.age);
    }
}
