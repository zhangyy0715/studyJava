package com3.myInteger;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        //1.定义一个字符串
        String s="91 27 46 38 50";
        //2.把字符串中的数字数据存储到一个int类型的数组中
        //2.1先通过split方法得到一个String数组
        String[] strArray = s.split(" ");
        //测试看下数组中是否有这些数据
//        for(int i=0;i<strArray.length;i++){
//            System.out.println(strArray[i]);
//        }
        //2.2定义一个int数组，把String[]数组中的每一个元素存储到int数组中
        int[] arr=new int[strArray.length];//给个数组长度
        for(int i=0;i<arr.length;i++){
            //把String类型的数组中的元素放到int类型的数组中，需要转下类型
            arr[i]= Integer.parseInt(strArray[i]);
        }
        //测试看下数组中是否有这些数据
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        //3.对int数组进行排序
        Arrays.sort(arr);
        //4.把排序好的int数组中的元素进行拼接得到一个字符串，这里拼接采用StringBuilder来实现
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< arr.length;i++){
            if(i== arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
