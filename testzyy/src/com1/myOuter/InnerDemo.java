package com1.myOuter;

public class InnerDemo {
    public static void main(String[] args) {
    // 创建内部类，并调用方法
    //内部类是public修饰的，才可以这样访问，不通常
//    Outer.Inner oi=new Outer().new Inner();
//    oi.show();
        //通常是用这样访问，创建外部类，调用外部类的method方法(方法中通过创建内部类调用了内部类方法)
        Outer o = new Outer();
        o.method();
    }
}
