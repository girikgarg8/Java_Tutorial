package com.collections_framework;
import java.util.Collection;

import javax.lang.model.element.Element;

import java.util.ArrayList;

public class ColllectionDemo {
    public static void main(String[] args) {
        Collection <String> fruitCollection=new ArrayList<>();
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("mango");

        System.out.println(fruitCollection);

        fruitCollection.remove("banana");

        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("apple"));

        fruitCollection.forEach((element)->{
            System.out.println(element);
        });

        fruitCollection.clear();

        System.out.println(fruitCollection);
    }
}
