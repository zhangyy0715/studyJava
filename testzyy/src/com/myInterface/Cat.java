package com.myInterface;

//public class Cat extends Object implements Jumpping 等同
public class Cat implements Jumpping{
    @Override
    public void jump() {
        System.out.println("猫可以调高了");
    }
}
