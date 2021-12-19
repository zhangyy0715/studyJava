package com.xingcan_chouxianglei;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        AnimalOperator ao = new AnimalOperator();
        Animal a=new Cat();
        ao.useAnimal(a);

        Animal a2 = ao.getAnimal();//new Cat()的结果赋值给a2
        a2.eat();
    }
}
