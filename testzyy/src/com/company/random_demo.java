package com.company;
//导包
import java.util.Random;
import java.util.Scanner;
public class random_demo {
    public static void main(String[] args){
        //创建对象
//        Random r=new Random();
//        for (int i=0;i<10;i++){
//            int number = r.nextInt(10);
//            System.out.println(number);
//        }
        //获取1-100之间的随机数
//        Random r1=new Random();
//        int number2 = r1.nextInt(100)+1;
//        System.out.println(number2);
        //猜数字
        Random r = new Random();
        int number = r.nextInt(100)+1;
        //死循环
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guestNumber = sc.nextInt();
            if (guestNumber>number){
                System.out.println("你猜的数字"+guestNumber+"大了");
            }else if (guestNumber<number){
                System.out.println("你猜的数字"+guestNumber+"小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
