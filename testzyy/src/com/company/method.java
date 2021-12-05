package com.company;

public class method {
    public static void main(String[] args) {
        //调用方法
        boolean n = isEvenNumber(10);
        System.out.println(n);
        int max_number = getMax(10,33);
        System.out.println(max_number);
    }
    public static boolean isEvenNumber(int number) {
//        int number=11;
        if(number%2==0){
//            System.out.println(true);
            return true;
        }else {
//            System.out.println(false);
            return false;
        }
    }
    public static int getMax(int a,int b){
//        int a=10;
//        int b=20;
        //if else
//        if(a>b){
//            System.out.println(a);
//        }else {
//            System.out.println(b);
//        }
        //三元
//        int result = a>b?a:b;
        return a>b?a:b;
//        return Math.max(a,b);
    }

}
