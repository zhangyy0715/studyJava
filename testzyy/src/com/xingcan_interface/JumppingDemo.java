package com.xingcan_interface;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping();//new Cat()赋值给了j2
        j2.jump();
    }
}
