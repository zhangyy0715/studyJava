package com.company;
import java.util.Scanner;
public class jianfeijihua {
    public static void main(String[] args) {
        jianfeijihua();
    }

//    public static void jianfei() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入：");
//        int week = sc.nextInt();
//        if(week<1||week>7){
//            System.out.println("你输入的星期错误");
//        }else if (week==1){
//            System.out.println("跑步");
//        }else if (week==2){
//            System.out.println("跑步2");
//        }else if (week==3){
//            System.out.println("跑步3");
//        }else if (week==4){
//            System.out.println("跑步4");
//        }else if (week==5){
//            System.out.println("跑步5");
//        }else if (week==6){
//            System.out.println("跑步6");
//        }else {
//            System.out.println("吃一顿");
//        }
//    }
    public static void jianfeijihua(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        int week = sc.nextInt();
        switch (week){
            case 1 ->System.out.println("跑步");
            case 2 ->System.out.println("跑步2");
            case 3 ->System.out.println("跑步3");
            case 4 ->System.out.println("跑步4");
            case 5 ->System.out.println("跑步5");
            case 6 ->System.out.println("跑步6");
            case 7 ->System.out.println("跑步7");
            default -> System.out.println("错误");
        }
    }
}
