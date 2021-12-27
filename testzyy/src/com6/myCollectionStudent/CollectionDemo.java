package com6.myCollectionStudent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Student> c= new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("张曼玉", 30);
        Student s2 = new Student("林青霞", 35);
        Student s3 = new Student("王祖贤", 33);
        //把学生对象添加到集合中
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //通过集合对象，调用Iterator方法得到迭代器对象，通过迭代器的hasNext方法获取元素
        //遍历集合（迭代器方式）
        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
