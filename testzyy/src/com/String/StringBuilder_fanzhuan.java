package com.String;

import java.util.Scanner;

//输入字符串，返回反转后的字符串
public class StringBuilder_fanzhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String line = sc.nextLine();
        String s1 = myReverse(line);
        System.out.println("reverse:"+s1);
    }
    public static String myReverse(String s){
//        StringBuilder sb=new StringBuilder();
//        for(int i=arr.length-1;i>=0;i--){
//            sb.append(arr[i]);
//        }
//        return sb.toString();
        return new StringBuilder(s).reverse().toString();
    }
}
