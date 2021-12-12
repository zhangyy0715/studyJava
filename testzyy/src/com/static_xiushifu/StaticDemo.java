package com.static_xiushifu;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university="南京林业大学";
        Student student = new Student();
        student.name="zyy";
        student.age=30;
        student.show();

        Student student1 = new Student();
        student1.age=31;
        student1.name="zyy1";
        student1.show();
    }
}
