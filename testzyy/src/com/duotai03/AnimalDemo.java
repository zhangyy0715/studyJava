package com.duotai03;

public class AnimalDemo {
    public static void main(String[] args) {

        //向上转型，从父类引用指向子类对象
        Animal a=new Cat();
        a.eat();
        //向下转型，从父类引用转为子类对象
        Cat c =(Cat)a;
        c.eat();
        c.playGame();
    }
}
