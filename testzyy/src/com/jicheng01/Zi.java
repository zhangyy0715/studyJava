package com.jicheng01;

public class Zi extends Fu{
    //子类无参构造方法
    public Zi() {
        super(20);
        System.out.println("Zi中无参构造方法");
    }
    //子类带参构造方法
    public Zi(int age){
        super(20);
        System.out.println("Zi中——带参构造方法");
    }
    //成员方法
    public void method(){
        super.show();
        System.out.println("zi_show");
    }
    public void show(){

        System.out.println("zi_show");
    }
}
