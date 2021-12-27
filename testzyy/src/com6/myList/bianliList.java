package com6.myList;

import java.util.ArrayList;
import java.util.Iterator;

public class bianliList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张雨茵");
        list.add("ghhg");
        list.add("哈哈哈");
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String n = it.next();
            System.out.println(n);
        }
        //for循环遍历
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
        //增强for循环遍历
        for(String i:list){
            System.out.println(i);
        }
    }
}
