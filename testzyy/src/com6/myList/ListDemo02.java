package com6.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>();
        Student s1 = new Student("张曼玉1",30);
        Student s2 = new Student("张曼玉2",30);
        Student s3 = new Student("张曼玉3",30);
        l.add(s1);
        l.add(s2);
        l.add(s3);


        Iterator<Student> it = l.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

        for(int i=0;i<l.size();i++){
            Student s = l.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
