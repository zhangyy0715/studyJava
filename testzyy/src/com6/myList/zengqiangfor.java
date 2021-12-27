package com6.myList;

import java.util.ArrayList;

public class zengqiangfor {
    public static void main(String[] args) {
        //int数组，增强for
        int[] arr={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
        //string数组，增强for
        String[] arr1={"hello","world","Java"};
        for(String i:arr1){
            System.out.println(i);
        }
        //list
        ArrayList<String> l = new ArrayList<>();
        l.add("z");
        l.add("y");
        l.add("y");
        for(String s:l){
            System.out.println(s);
        }
        //内部原理是Iterator迭代器，验证其内部是一个Iterator迭代器，用下面这个方法验证（因为会报错）
        for(String s:l){
            if(s.equals("world")){
                l.add("jjjjjjj");
            }
        }
    }
}
