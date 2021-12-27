package com6.mySet;

public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student("zyy", 30);
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        //默认情况下，不同对象的哈希值是不相同的
        Student s1 = new Student("zyy1", 30);
        System.out.println(s1.hashCode());
        //通过方法重写，可以实现不同对象的哈希值是相同的

        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
