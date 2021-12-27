package com6.myTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        //带参构造方法，指定比较器，传入的是接口的实现类：1、可以定义一个类，实现该接口。2、可以用匿名内部类
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) { //方法在匿名内部类里面，然后传入的是学生对象参数
                //年龄从小到大排序
                //this.age-s.age
                //s1,s2
                //这次不能直接写age了，要写getAge调方法来访问成员变量值
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        Student s1 = new Student("zyy1", 30);
        Student s2 = new Student("zyy2", 32);
        Student s3 = new Student("zyy3", 34);
        Student s4 = new Student("zyy4", 33);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
