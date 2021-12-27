package com6.myHashSet;

import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student s = new Student("张雨茵", 30);
        Student s1 = new Student("张雨茵1", 30);
        Student s2 = new Student("张雨茵", 30);

        hs.add(s);
        hs.add(s1);
        hs.add(s2);
        System.out.println(hs);
        for(Student i:hs){
            System.out.println(i.getName()+","+i.getAge());
        }

    }
}
