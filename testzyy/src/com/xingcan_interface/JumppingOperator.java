package com.xingcan_interface;

public class JumppingOperator {

    public void useJumpping(Jumpping j){
        j.jump();
    }
    public Jumpping getJumpping(){
        Jumpping j=new Cat();
        return j;
    }
}
