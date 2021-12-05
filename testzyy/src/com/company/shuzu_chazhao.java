package com.company;

import java.util.Scanner;

public class shuzu_chazhao {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("input:");
        int number = sc.nextInt();
//        int index = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==number){
//                index=i;
//                break;
//            }
//        }
//        System.out.println(index);
        int flag = getIndex(arr,number);
        System.out.println(flag);
    }
    public static int getIndex(int[] arr,int number){
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                index=i;
                break;
            }
        }
        return index;
    }
}
