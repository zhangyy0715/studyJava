package com6.mySet;

import java.util.HashSet;
import java.util.Set;


public class SetDemo {
    public static void main(String[] args) {
        //set是一个接口，不能实例化，所以要找它的实现类(HashSet)
        //创建集合对象
        Set<String> set = new HashSet<String>();
        set.add("he");
        set.add("wor");
        set.add("ja");
        set.add("he");
        System.out.println(set);

        for(String s:set){
            System.out.println(s);
        }
    }
}
