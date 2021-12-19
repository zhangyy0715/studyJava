package com2.myMath;

public class MathDemo {

    public static void main(String[] args) {
        System.out.println(Math.abs(-88));

        System.out.println(Math.ceil(12.34));

        System.out.println(Math.round(12.43));

        System.out.println(Math.max(77,88));

        System.out.println(Math.pow(2,4));

        System.out.println(Math.random()); //[0.0,1.0)左闭右开
        System.out.println(Math.random()*100); //0-99之间
        System.out.println((int)(Math.random()*100));//强转成int类型的整数，0-99
//        如果要100之间，就要+1了
        System.out.println((int)(Math.random()*100)+1);
    }
}
