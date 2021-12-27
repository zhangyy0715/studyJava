package com6.myList;

import java.util.LinkedList;

public class myLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("zyy");
        l.add("zyy1");
        l.add("zyy2");
        l.addFirst("ee");
        l.addLast("xx");
        System.out.println("----------"+l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println("result"+l);
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());

        System.out.println("result"+l);
    }
}
