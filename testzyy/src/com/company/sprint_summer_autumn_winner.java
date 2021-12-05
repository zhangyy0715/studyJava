package com.company;
import java.util.Scanner;
public class sprint_summer_autumn_winner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = sc.nextInt();
//        switch (month) {
//            case 1 -> System.out.println("冬季");
//            case 2 -> System.out.println("冬季");
//            case 3 -> System.out.println("春季");
//            case 4 -> System.out.println("春季");
//            case 5 -> System.out.println("春季");
//            case 6 -> System.out.println("夏季");
//            case 7 -> System.out.println("夏季");
//            case 8 -> System.out.println("夏季");
//            case 9 -> System.out.println("秋季");
//            case 10 -> System.out.println("秋季");
//            case 11 -> System.out.println("秋季");
//            case 12 -> System.out.println("冬季");
//            default -> System.out.println("输入错误");
//        }
        switch (month) {
            case 1, 2, 12 -> System.out.println("冬季");
            case 4, 5, 3 -> System.out.println("春季");
            case 6, 7, 8 -> System.out.println("秋季");
            case 9, 10, 11 -> System.out.println("冬季");
            default -> System.out.println("输入错误月份");
        }
    }
}
