package com.jicheng01;

public class Demo {
    public static void main(String[] args) {
        //创建对象
        Zi z=new Zi();//子中无参构造方法访问时，会调用父中无参构造方法
        Zi z1=new Zi(30);//子中带参构造方法访问时，会调用父中无参构造方法
        z.method();
        z.show();
    }
}
