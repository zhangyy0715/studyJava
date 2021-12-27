package com6.myList;

import java.util.ArrayList;
import java.util.Iterator;

public class myArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 = new Student("zyy1", 30);
        Student s2 = new Student("zyy2", 29);
        Student s3 = new Student("zyy3", 28);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        for(Student s:arrayList){
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("-----------------");
        for(int i=0;i<arrayList.size();i++){
            Student student = arrayList.get(i);
            System.out.println(student.getName()+","+student.getAge());
        }
        System.out.println("-----------------");
        Iterator<Student> it = arrayList.iterator();
        while(it.hasNext()){
            Student next = it.next();
            System.out.println(next.getName()+","+next.getAge());
        }

    }
}
