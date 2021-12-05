package com.company;

public class array_01 {
    public static void main(String[] args) {
//        //动态初始化
//        int[] arr=new int[3];
//        //输出数组名
//        System.out.println(arr);//输出内存空间地址名[I@4617c264
//        //输出数组中的元素，索引
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        arr[0]=100;
//        arr[1]=200;
//        System.out.println(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
        //静态初始化
        //格式
//        int[] arr=new int[]{1,2,3};
//        //简化格式
//        int[] arr1={1,2,3};
//        System.out.println(arr);
//        System.out.println(arr1);
//        System.out.println(arr[0]);
//        //遍历
//        int[] arr={11,22,33};
//        for(int x=0;x<arr.length;x++){
//            System.out.println(arr[x]);
//        }
        //获取最大值
        int[] arr={12,45,98,73,60,101,7};
        int max;
        max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //获取最小值
        System.out.println(max);
        int min;
        min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
