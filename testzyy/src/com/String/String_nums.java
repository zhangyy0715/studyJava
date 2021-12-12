package com.String;

import java.util.Scanner;

public class String_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input:");
        String line = sc.nextLine();
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if(ch>='A' && ch<='Z'){
                bigCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else if(ch>='0' && ch<='9'){
                numberCount++;
            }
        }
        System.out.println("大写"+bigCount);
        System.out.println("小写"+smallCount);
        System.out.println("数字"+numberCount);
    }
}
