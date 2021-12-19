package com3.myInteger;

public class myInteger {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //NumberFormatException不能传字符串
        Integer i1=Integer.valueOf(100);
        System.out.println(i1);

        Integer i2=Integer.valueOf("100");
        System.out.println(i2);
    }
}
