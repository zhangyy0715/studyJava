package com1.myOuter02;

public class Outer {
    public void method(){
        //匿名内部类是局部内部类的一种形式，所以也要在方法里来写
        //匿名内部类的本质是继承了该类或者实现了该接口的子类匿名对象
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
    }
}
