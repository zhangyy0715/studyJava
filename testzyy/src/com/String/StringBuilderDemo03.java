package com.String;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        //StringBuilder转String，用toString()转
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        String s = sb.toString();
        System.out.println(s);
        //String转StringBuilder，通过构造方法转
        String s1="hellllll";
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
    }
}
