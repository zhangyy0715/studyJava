package com.jicheng03;

public class Demo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        //无参构造方法
        Teacher t1=new Teacher();
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();
        //带参构造方法
        Teacher t2=new Teacher("风清扬",30);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

        Student student = new Student();
        student.setName("张雨茵");
        student.setAge(30);
        System.out.println(student.getName()+","+student.getAge());

        Student student1 = new Student("zyy", 30);
        System.out.println(student1.getName()+","+student1.getAge());
    }
}
