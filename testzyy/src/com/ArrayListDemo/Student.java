package com.ArrayListDemo;

public class Student {
    String name;
    int age;

    //无参构造方法
    public Student() {
    }

    //有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
