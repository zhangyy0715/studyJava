package com.myAbstract01;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        a=new Cat("加菲",4);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();
    }
}
