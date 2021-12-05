package com.fengzhuang;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "zyy";
//        s.age = -30;
        s.setAge(-30);
        s.getAge();
        s.show();
    }
}
