package com1.myOuter03;
//测试类
public class JumppingDemo {
    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调用method方法
        JumppingOperator jo = new JumppingOperator();
        //调用method方法，其实是要接口的实现类，但是现在连实现类都没有啊，来造一个Cat类
        Jumpping j = new Cat();
        jo.method(j);
        System.out.println("-------");
        //用匿名内部类改变
        //method参数要的是接口的实现类对象，匿名内部类的本质就是一个对象，并且是实现了该接口的对象，而且是匿名的
        //就是说我要的对象没有必要再新写一个类，只要按照匿名内部类的接口就可以了
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以调高了");
            }
        });
        //采用这种形式就不用多写两个类出来了，比如Cat 和 Dog
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以调高了");
            }
        });
    }
}
