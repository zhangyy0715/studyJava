package com6.myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        //boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("Java");
//        System.out.println(c.remove("helloeee"));
//        c.clear();
//        System.out.println(c.contains("hello"));
//        System.out.println(c.contains("hello111"));
//        System.out.println(c.isEmpty());
//        c.clear();
//        System.out.println(c.isEmpty());
//        System.out.println(c.size());
//        System.out.println(c)
        //Iterator是个接口，那么c调用iterator()返回的是什么东西呢？
        Iterator<String> it= c.iterator();
        /*
        看下iterator的源码：返回一个new Itr()，Iterator返回的是接口的实现类对象，所以Itr实现了这个接口
        Itr是类，实现了Iterator接口，并且Itr类是定义在集合里面的，由此可见Itr是个内部类，并且重写了next方法，hasNext方法等
        返回Itr的实现对象，所以是通过多态方式得到Iterator对象。
        public Iterator<E> iterator() {
            return new Itr();
        }
        private class Itr implements Iterator<E> {}
         */
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
//        if(it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
