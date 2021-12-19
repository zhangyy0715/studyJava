package com3.myInteger;

public class IntegerDemo {
    public static void main(String[] args) {
        //int-->String
        int number=100;
        //方式1
        String s1=""+number;
        System.out.println(s1);

        //方式2:静态方法：String类中有一个方法valueOf可以把int转成String
        //public static String valueOf(int i)
        String s2=String.valueOf(number);
        System.out.println(s2);

        System.out.println("--------------");

        //String-->int
        String s="100";
        //方式1:通过Integer作为桥梁
        //String-->Integer-->int
        Integer i = Integer.valueOf(s);
        //查Integer手册可以找到一个方法 public int intValue()
        int x=i.intValue();
        System.out.println(x);

        //方式2：静态方法,Integer类中有一个方法parseInt，直接把String转为int
        //public static int parseInt(String s)
        int y=Integer.parseInt(s);
        System.out.println(y);
    }
}
