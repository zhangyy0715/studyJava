package com6.myCollection;

import java.util.ArrayList;
import java.util.Collection;

/*
创建Collection集合的对象
多态的方式
ArrayList()
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象，尖括号里面是泛型，表示将来里面存储String类型的数据
        Collection<String> c=new ArrayList<String>();
        //添加元素：boolean add(E e)//E是类型，必须和定义一样，字符串类型String
        c.add("hello");
        c.add("world");
        c.add("Java");
        System.out.println(c);//输出[hello, world, Java]，ArrayList重写了toString方法
    }
}
