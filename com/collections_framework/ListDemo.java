package com.collections_framework;
import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        List <String> list=new ArrayList<>();

        //list allows to have duplicate elements
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");

        System.out.println(list);

        //list allows to have null values
        list.add(null);
        list.add(null);
        System.out.println(list);

        //accessing element from list
        System.out.println(list.get(0));
        System.out.println(list.get(3));
    }
}
