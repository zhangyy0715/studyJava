package com3.myInteger;

public class zhuangxiang {
    public static void main(String[] args) {
        //1.装箱：把基本数据类型转换为对应的包装类类型
        //手动装箱
        Integer i = Integer.valueOf(100);
        //自动装箱，底层也做了Integer.valueOf(100)这个操作
        Integer ii = 100;

        //2.拆箱：把包装类类型转换为对应的基本数据类型
        //手动拆箱
        ii = ii.intValue() + 200;//先ii.intValue()转换为int类型【这个动作叫拆箱】，+200后赋值给ii，叫做自动装箱

        //自动拆箱
        ii+=200;//内部隐含了自动拆箱和自动装箱

        //3.空指针
        Integer iii=null;
        if(iii!=null){
            iii+=300; //不加if判断就会报NullPointerException,null调intValue方法必然报错
        }
    }
}
