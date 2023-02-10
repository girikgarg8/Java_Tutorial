package com.collections_framework;
import java.util.*;

//How to add all elements from an existing collection to an ArrayList using addAll() method
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> firstFivePrime = new ArrayList<>();
        firstFivePrime.add(2);
        firstFivePrime.add(3);
        firstFivePrime.add(5);
        firstFivePrime.add(7);
        firstFivePrime.add(11);

        List<Integer> firstTenPrime = new ArrayList<>(firstFivePrime);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();

        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrime.addAll(nextFivePrimeNumbers);

        firstTenPrime.set(3,6);
        System.out.println(firstTenPrime.isEmpty());

        System.out.println(firstTenPrime.size());


        System.out.println(firstTenPrime);


        List <String> fruitCollection = new ArrayList<>();
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("mango");
        fruitCollection.add("pineapple");
        fruitCollection.add("litchi");

        System.out.println(fruitCollection);

        fruitCollection.remove(2);
        System.out.println(fruitCollection);

        System.out.println("After removing element 2, the list is "+fruitCollection);

        List<String> subFruit=new ArrayList<>();

        subFruit.add("banana");
        subFruit.add("pineapple");

        fruitCollection.removeAll(subFruit);

        System.out.println("After calling removeAll, the fruitCollection is " + fruitCollection);

        fruitCollection.clear(); //empties the entire list

        System.out.println(fruitCollection);


        System.out.println(firstTenPrime);

        //iterating over an arrayList: different ways

        //basic for loop
        for (int i=0;i<firstTenPrime.size();i++){
            System.out.println(firstTenPrime.get(i));
        }


        //enhanced for loop

        for (Integer number:firstTenPrime){
            System.out.println(number);
        }

        //basic loop with iterator

        for (Iterator it=firstTenPrime.iterator();it.hasNext();){
            Integer num=(Integer)it.next();
            System.out.println(num);
        }

        // iterator with while loop

        Iterator <Integer> itr=firstTenPrime.iterator();
        while (itr.hasNext()){
            Integer num=(Integer) itr.next();
            System.out.println(num);
        }

        //Java 8 Stream+ lamba example

        firstTenPrime.stream().forEach((num)->System.out.println(num)); 
        /*
         * In Java, a Stream is a sequence of elements that can be processed in parallel
         * or sequentially, supporting operations like map, filter, reduce, and others.
         * Java Streams were introduced in Java 8 as part of the Java Standard Library
         * and provide an easy way to process collections of data using functional
         * programming constructs.
         * 
         * In NodeJS, the concept of a stream is similar, but the implementation is
         * different. A Stream in NodeJS is a way to represent a continuous flow of
         * data. The NodeJS Stream API provides a way to manipulate and process data in
         * a way that is similar to the Java Streams API, but the two are not directly
         * compatible.
         * 
         * Both Java and NodeJS Streams are designed to handle large amounts of data by
         * allowing the processing to occur in small chunks, rather than reading the
         * entire dataset into memory at once. This makes streams useful for working
         * with large files or data sets that would otherwise consume too much memory to
         * process efficiently.
         * 
         * Streams are particularly useful when you need to process large amounts of
         * data, because they allow you to process the data in chunks, rather than
         * reading the entire dataset into memory at once. Here's a common use case:
         * 
         * Imagine you have a large log file containing millions of log entries, and you
         * need to extract all log entries that contain a specific error message.
         * Without streams, you would have to read the entire log file into memory,
         * which could be time-consuming and consume a lot of memory. With streams, you
         * could read the log file one chunk at a time, process each chunk, and extract
         * only the log entries that match your search criteria. This would be much more
         * efficient in terms of memory usage and processing time.
         * 
         * Another use case for streams is to perform operations on a collection of data
         * in parallel, to take advantage of multi-core processors. For example, you
         * could use a stream to process a large collection of images, applying a filter
         * to each image in parallel to make the processing more efficient.
         * 
         * These are just a few examples, but there are many more use cases where
         * streams can be useful, including data processing, data transformation, and
         * data analysis.
         * 
         */

         //Java 8: forEach + lambda function
        
         firstTenPrime.forEach((num)->System.out.println(num));
    }

}
