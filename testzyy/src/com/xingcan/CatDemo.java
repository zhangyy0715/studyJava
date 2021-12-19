package com.xingcan;

public class CatDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat co2 = co.getCat();//是返回new Cat，赋值给co2
        co2.eat();
    }
}
