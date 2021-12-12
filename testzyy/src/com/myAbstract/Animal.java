package com.myAbstract;

public abstract class Animal {

    private int age=30;
    private final String city = "北京";

    //抽象类不能实例化指的是抽象类不能直接实例化，
    //但是可以通过多态的方式实例化，通过子类访问父类构造数据的方式实例化，所以父类也要提供构造方法
    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("睡觉");
    }
}
