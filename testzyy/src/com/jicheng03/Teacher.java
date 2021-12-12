package com.jicheng03;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);//继承父类的带参构造方法
    }

    public Teacher() {
    }

    public void teach(){
        System.out.println("教学生");
    }
}
