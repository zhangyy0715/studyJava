package com1.myOuter;

public class Outer {
    private int num=10;
    //不通常
//    public class Inner{
//        //在一个类里面要写方法的
//        public void show(){
//            System.out.println(num);
//        }
//    }
    //通常：写一个内部类，再写一个成员方法，在成员方法里创建对象，调用内部类
    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
