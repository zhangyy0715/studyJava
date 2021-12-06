package com.company;
import java.util.Scanner;
public class shujushuru {
    public static void main(String[] args){
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入第1个和尚的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第2个和尚的身高：");
        int height2 = sc.nextInt();
        System.out.println("请输入第3个和尚的身高：");
        int height3 = sc.nextInt();

//        sc.nextLine();
        //比较
        int temp = height1>height2?height1:height2;
        int result = temp>height3?temp:height3;
        //输出数据
        System.out.println("这三个和尚中最高身高"+result+"cm");
    }
}
