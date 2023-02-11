package com.collections_framework;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map <String,Integer> numberMapping =new HashMap<>();

        //adding key-value pairs to map
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put(null,7);

        System.out.println(numberMapping);


        //Check if hashmap is empty
        System.out.println(numberMapping.isEmpty());

        //find size of hashmap

        System.out.println(numberMapping.size());

        //check if key exists in hashmap

        if (numberMapping.containsKey("Four")){
            System.out.println(" Key Exists");
        }
        else{
            System.out.println("Key Not exists");
        }

        //getting value by key in Java

        Integer v1=numberMapping.get("One");
        System.out.println(v1);

        //  check if a value exists in hashmap

        if (numberMapping.containsValue(4)){
            System.out.println("Value exists");
        }
        else{
            System.out.println("Not exists");
        }

        //how to remove keys from hashmap

        numberMapping.remove("One");
        System.out.println(numberMapping);

        //get only keys from hashmap

        Set <String> keys=numberMapping.keySet();
        System.out.println(keys);

        Collection <Integer> values=numberMapping.values();
        System.out.println(values);

        //different ways to iterate over hashmap

        //for Each method

        for (Map.Entry <String,Integer> entry:numberMapping.entrySet()){
            System.out.println("key -> "+entry.getKey()+ " value -> "+entry.getValue());
        }

        //using iterator

        Set <Map.Entry<String,Integer>> entries =numberMapping.entrySet();
        Iterator <Map.Entry<String,Integer>> iterator=entries.iterator();

        while (iterator.hasNext()){
            Map.Entry <String,Integer> entry=iterator.next();
            System.out.println("key-> "+entry.getKey()+ " value -> "+entry.getValue());
        }

        //hashmap using Java8 forEach

        numberMapping.forEach((K,V)->{
            System.out.println(" K "+K);
            System.out.println(" V "+V);
        });


        //Using custom student for hashmap
        Map <Integer,Student> studentMap=new HashMap <Integer,Student> ();

        studentMap.put(1,new Student("Ramesh","Garg"));
        studentMap.put(2, new Student("Raju", "Verma"));

        System.out.println(studentMap.values());
    }
}
