package com.ArrayListDemo;

import java.util.ArrayList;

public class ArrayList_Student {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array=new ArrayList<Student>();
        //创建学生对象
        Student s1=new Student("zyy",29);
        Student s2=new Student("ss",26);
        Student s3=new Student("aj",77);
        //将学生对象添加到集合对象中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //遍历
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getName()+"is"+s.getAge());
        }
    }
}
