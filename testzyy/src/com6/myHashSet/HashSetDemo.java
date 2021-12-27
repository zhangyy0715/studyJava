package com6.myHashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("h");
        hs.add("h1");
        hs.add("h");
        for(String i:hs){
            System.out.println(i);
        }
    }
}
