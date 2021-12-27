package com6.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("w");
        list.add("j");
        list.add("h");
        list.add(1,"javaee");
        //list.add(11,"javaee");会报索引越界的错误

//        System.out.println(list.remove(1));//不能索引越界
//        System.out.println(list.set(1,"xx"));//不能索引越界
//        System.out.println(list.get(3));
//        System.out.println(list);
        //list继承自Collection，所以Collection中的遍历元素的方式List依然可用
        //迭代器的方式遍历，先让list调用Iterator方法
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }
//        //通过索引遍历
//        for(int i=0;i<list.size();i++){
//            String s = list.get(i);
//            System.out.println(s);
//        }

//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            System.out.println("s:"+s);
//            if(s.equals("h")){
//                System.out.println("----");
//                //list.add("javaee");//报错ConcurrentModificationException，并发修改异常，不能修改
//            }
//        }
//        System.out.println(list);
        //listIterator!
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("h")){
                lit.add("xxxxxxxxxxxxxxx");
            }
        }
        System.out.println(list);

    }
}
