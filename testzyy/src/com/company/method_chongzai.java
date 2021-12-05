package com.company;

public class method_chongzai {
    public static void main(String[] args) {
//        int result = sum(10,20);
//        double result2 = sum(10.0,20.0);
//        int result3 = sum(10,20,30);
//        System.out.println(result);
        int[] arr={11,22,33,44,55};
//        printArray(arr);
        System.out.println(getMax(arr));
    }

//    public static int sum(int a,int b) {
//        return a+b;
//    }
//    public static double sum(double a,double b) {
//        return a+b;
//    }
//    public static int sum(int a,int b,int c) {
//        return a+b+c;
//    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.print(arr[x]);
            }
            else {
                System.out.print(arr[x]+", ");
            }
        }System.out.print("]");
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int x=0;x<arr.length;x++){
//            if(arr[x]>max){
//                max=arr[x];
//            }
        }return max;
    }
}
