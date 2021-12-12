package com.ArrayListDemo;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //集合中将来存储的是String类型的元素
        //public ArrayList():创建一个空的集合对象
        ArrayList<String> array = new ArrayList<>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //指定位置添加元素
        array.add(1,"javase");
        array.add(4,"ka");
//        array.add(7,"ok");
        //remove
//        array.remove("java");
//        System.out.println(array.remove(1));
//        System.out.println(array.set(1,"eeee"));
        System.out.println(array.get(0));
        System.out.println(array.size());
        System.out.println("array:"+array);

    }
}
