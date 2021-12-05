package com.company;

public class xunhuan_while {
//    public static void main(String[] args){
//        int i=1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }
//    }
    //珠穆朗玛峰
    public static void main(String[] args){
        int count = 0;
        double paper = 0.1;
        int zf = 8844430;
        while(paper<=zf){
            paper*=2;
            count++;
        }System.out.println(count);
    }
}
