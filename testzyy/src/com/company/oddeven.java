package com.company;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
