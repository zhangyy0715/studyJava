package com2.myObject;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);
//        System.out.println(s1);
        //com2.myObject.Student@36baf30c
        //看源码后发现是底层调用的toString方法（是父类Object的toString方法）
//        System.out.println(s1.toString());//com2.myObject.Student@36baf30c

        Student s2 = new Student();
        s2.setName("青霞");
        s2.setAge(30);

        //需求：比较两个对象的内容是否相同
        // 下面的方式比较的是地址值，不是内容！不可取
        System.out.println(s1==s2);
        //用equals
        System.out.println(s1.equals(s2));//这是Object的equals方法，不是String的equals方法
        /* 源码
        public boolean equals(Object obj) {
            //this---s1
            //obj---s2 默认比较地址，所以肯定是不相同了，怎么办呢？重写equals方法
            return (this == obj);
        }
         */


    }
}
