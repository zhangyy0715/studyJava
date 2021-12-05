package com.fengzhuang;

public class Student {
    String name;
    private int age;

    //提供get/set方法,针对age这个私有变量提供了get和set方法
    public void setAge(int a){
        if(a>0 && a<120){
            age = a;
        }else {
            System.out.println("error input");
        }
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+","+age);
    }
}
