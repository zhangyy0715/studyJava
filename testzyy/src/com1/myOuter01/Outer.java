package com1.myOuter01;

public class Outer {

    private int num=10;

    public void method(){
        int num2=20;
        class Inner{
            //里面是show方法的定义，没有调用
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        //在方法内创建局部内对象的方法，然后调用里面的方法
        Inner i=new Inner();
        i.show();
    }
}
