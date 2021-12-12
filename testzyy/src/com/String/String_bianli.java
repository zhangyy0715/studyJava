package com.String;

import java.util.Scanner;
//遍历字符串
public class String_bianli {
    public static void main(String[] args) {
        int[] arr = {111,22,2222};
        System.out.println(arr.length);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String line = sc.nextLine();
        for(int i=0;i<line.length();i++){
            System.out.println(line.charAt(i));//charAt(index)取到具体值
        }
    }
}
