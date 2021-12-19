package com.xingcan;

public class CatOperator {
    public void useCat(Cat c){
        c.eat();
    }
    //返回Cat类型的数据，Cat类型的数据是什么？是对象，所以要新建一个方法
    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }
}
