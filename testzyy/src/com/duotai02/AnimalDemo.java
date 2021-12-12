package com.duotai02;

//测试类
public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();

        Dog d = new Dog();
        ao.useAnimal(d);

        Pig p=new Pig();
        ao.useAnimal(p);

        Cat c=new Cat();
        ao.useAnimal(c);
    }
}
