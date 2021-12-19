package com2.myArrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={24,69,80,57,13};
        System.out.println("排序前："+arrToString(arr));
/*
        //第一次比较
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        //第二次比较
        for(int i=0;i<arr.length-1-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

 */
        //x<4改一下，n个元素比较只要比较n-1次
        for(int x=0;x<arr.length-1;x++){
            for(int i=0;i<arr.length-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("排序后："+arrToString(arr));
    }

    public static String arrToString(int[] arr){
        //把数组中的元素按照制定的规则组成一个字符串：[元素1，元素2，]
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
