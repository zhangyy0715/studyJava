package com6.myList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("h");
        array.add("h1");
        array.add("h2");

        for(String i:array){
            System.out.println(i);
        }

        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("w");
        linkList.add("w1");
        linkList.add("w2");
        for(String i:linkList){
            System.out.println(i);
        }
    }
}
