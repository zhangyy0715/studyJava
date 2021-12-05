package com.company;

public class zizeng {
    public static void main(String[] args){
        int i = 10;
        //单独使用放前面和后面都一样
        //i++;
        //++i;
        System.out.println(i);
        //参与操作使用，下面是先把i赋值给j，然后i再++
//        int j = i++;
//        System.out.println(j);
//        System.out.println(i);

        //参与操作使用，下面是先把i++自加，然后把自加后的值给j
        int j = ++i;
        System.out.println(j);
        System.out.println(i);
    }
}
