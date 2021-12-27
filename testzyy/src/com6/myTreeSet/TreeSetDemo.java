package com6.myTreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        //基本类型存储的时候用的它的包装类
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(40);
        ts.add(30);

        ts.add(30);
        for(Integer i:ts){
            System.out.println(i);
        }
    }
}
