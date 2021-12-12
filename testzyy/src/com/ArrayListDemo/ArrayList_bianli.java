package com.ArrayListDemo;

import java.util.ArrayList;

public class ArrayList_bianli {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("张雨茵");
        array.add("zyy");
        array.add("yyyyy");
//        用index获取
        for(int i=0;i<array.size();i++){
            String s=array.get(i);
            System.out.println("输出："+s);
        }
//        和python直接遍历元素类似
        for (String s : array) {
            System.out.println("输出：" + s);
        }
    }
}
