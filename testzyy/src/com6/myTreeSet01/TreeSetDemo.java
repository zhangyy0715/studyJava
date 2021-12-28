package com6.myTreeSet01;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //要通过比较器排序实现，就要在创建对象的时候传进去一个接口的实现类对象，这里采用匿名内部类实现
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //总分从低到高，所以s2在前，s1在后。总分：相加
                //int num = (s2.getChinese()+s2.getMath())-(s1.getChinese()+s1.getMath())
                //在学生类里面提供一个对外求总分的方法
                int num = s2.getSum()-s1.getSum();//主要条件
                //如果num==0，那么比较语文成绩是否相同，这是次要条件，s1-s2是升序
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                //如果num2==0,那么比较名字是否相同，这是次次要条件。字符串用compareTo比较
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });
        //创建学生对象
        Student s1 = new Student("林青霞", 98,100);
        Student s2 = new Student("张曼玉", 95,95);
        Student s3 = new Student("王祖贤", 100,93);
        Student s4 = new Student("柳岩", 100,97);
        Student s5 = new Student("风清扬", 98,98);

        Student s6 = new Student("左冷禅", 97,99);
        Student s7 = new Student("赵云", 97,99);

        //学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        //遍历集合
        for(Student s:ts){
            System.out.println(s.getName()+","+s.getChinese()+","+s.getMath()+","+s.getSum());
        }
    }
}
