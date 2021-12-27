package com6.myLinkedHashset;

import java.util.LinkedHashSet;

public class myLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lin = new LinkedHashSet<>();

        lin.add("hello");
        lin.add("world");
        lin.add("java");
        lin.add("hello");

        for (String s:lin){
            System.out.println(s);
        }
    }
}
