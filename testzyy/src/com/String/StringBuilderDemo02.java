package com.String;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("Java");
        System.out.println(sb);
        sb.append("nini").append("byby");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
