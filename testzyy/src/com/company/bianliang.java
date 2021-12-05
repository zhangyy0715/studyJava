package com.company;

public class bianliang {
    public static void main(String[] args){
        //定义变量
        int a = 10;
        //输出变量
        System.out.println(a);
        //修改变量
        a = 20;
        System.out.println(a);
        char b = 'A';
        System.out.println(b);
        long l = 10000000000L;
        System.out.println(l);
        float f = 13.14F;
        System.out.println(f);
        //强制类型转换会有数据的丢失
        int k = (int)88.88;
        System.out.println(k);
        int i =10;
        char c = 'A';
        System.out.println(i+c);
        //char类型会被自动提升
        int j =i+c;
        System.out.println(j);
        //赋值运算符
        int m = 10;
        m+=20;
        System.out.println(m);
    }
}
