package com.myInterface02;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j=new Cat();
        j.jump();
        System.out.println("--------");

        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(4);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        //用的最多的子类，因为里面实现的最多
        Cat c=new Cat();
        c.setName("加菲");
        c.setAge(4);
        System.out.println(c.getName()+", "+c.getAge());
        c.eat();
        c.jump();
    }
}
