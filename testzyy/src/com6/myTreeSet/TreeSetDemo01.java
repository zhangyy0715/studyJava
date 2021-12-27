package com6.myTreeSet;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

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
