package com2.mySystem;

public class SystemDemo {

    public static void main(String[] args) {
        System.out.println("start");
//        System.exit(0);
        System.out.println("end");

        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
        //看耗时
        long start = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时："+(end-start)+"毫秒");
    }

}
