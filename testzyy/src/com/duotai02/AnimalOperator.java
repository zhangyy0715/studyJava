package com.duotai02;
//动物操作类
public class AnimalOperator {
    //每次都要写一次，麻烦，可以利用多态
//    public void useAnimal(Cat c){
//        c.eat();
//    }
//    public void useAnimal(Dog d){
//        d.eat();
//    }
    public void useAnimal(Animal a){
        //Animal a=new Cat();
        //Animal a=new Dog();
        a.eat();
//        a.lookDoor();//不能访问子类特有方法
    }
}
