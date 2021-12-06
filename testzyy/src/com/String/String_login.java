package com.String;

import java.util.Scanner;

public class String_login {
    public static void main(String[] args) {
        //已知用户名和密码，定义两个字符串表示
        String username="itheima";
        String password="czbk";
        for(int i=0;i<3;i++){
            //键盘输入字符串密码，Scanner实现
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();
            //拿键盘录入的和定义好的比较，给出相应提示
            if(name.equals(username) && pwd.equals(password)){
                System.out.println("success");
                break;
            }else {
                if (2-i==0){
                    System.out.println("锁定");
                }else{
                    System.out.println("fail，你还有"+(2-i)+"次机会");
                }
            }
        }
    }
}
