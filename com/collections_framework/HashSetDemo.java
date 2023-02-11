package com.collections_framework;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set <String> fruitsCollection=new HashSet<>();
        fruitsCollection.add("apple");
        fruitsCollection.add("banana");
        fruitsCollection.add("carrot");
        //adding duplicate element
        fruitsCollection.add("apple");
        System.out.println(fruitsCollection);

        //Creating an hashset from another collection

        List<Integer> firstFivePrimeNumbers= new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(4);
        firstFivePrimeNumbers.add(6);
        firstFivePrimeNumbers.add(8);
        firstFivePrimeNumbers.add(10);

        Set <Integer> tenEvenNumbers=new HashSet<>(firstFivePrimeNumbers);

        System.out.println(tenEvenNumbers);

        List<Integer> nextEvenNumbers=new ArrayList<>();

        nextEvenNumbers.add(12);
        nextEvenNumbers.add(14);
        nextEvenNumbers.add(16);
        nextEvenNumbers.add(18);
        nextEvenNumbers.add(20);

        tenEvenNumbers.addAll(nextEvenNumbers);

        System.out.println(tenEvenNumbers);


        //remove,removeAll and clear Method in Java

        tenEvenNumbers.remove(2);
        System.out.println(tenEvenNumbers);

        Set <Integer> removeList= new HashSet<>();

        removeList.add(6);
        removeList.add(8);

        tenEvenNumbers.removeAll(removeList);

        System.out.println(tenEvenNumbers);

        tenEvenNumbers.clear();
        System.out.println(tenEvenNumbers);

    }
}
