package com.thisstudy;

public class StudentGouzao {
    private String name;
    private int age;

    //无参构造方法
    public StudentGouzao() {
        System.out.println("无参构造方法");
    }
    //有参，带多个参数的构造方法
    public StudentGouzao(String name,int age){
        System.out.println("有参构造方法");
        this.name = name;
        this.age = age;
    }
    //成员方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void show() {
        System.out.println(name + ", " + age);
    }
}
