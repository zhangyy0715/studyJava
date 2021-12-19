package com5.myException;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int[] arr={1,2,3};
            System.out.println(arr[3]);//new 异常类对象，然后拿来和catch里面匹配
        }catch (ArrayIndexOutOfBoundsException e){
//        System.out.println(e.getMessage());//Index 3 out of bounds for length 3
//        System.out.println(e.toString());//异常原因，包含getMessage
          e.printStackTrace();
        }
    }
}
