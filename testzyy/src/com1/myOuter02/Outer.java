package com1.myOuter02;

public class Outer {
    public void method() {
        //匿名内部类是局部内部类的一种形式，所以也要在方法里来写
        //匿名内部类的本质是继承了该类或者实现了该接口的子类匿名对象
        /*
        //没有调用show方法，自然也不会输出了
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        */
        //下面，对象调show方法
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
        //多次调用，怎么用呢？？对象应该有返回值
        //接口的实现类对象
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        //多态方式,i调show方法，左边Inter里面有show方法，实现看右边，右边重写了show方法
        i.show();
    }
}
