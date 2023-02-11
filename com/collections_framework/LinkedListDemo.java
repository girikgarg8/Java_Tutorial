package com.collections_framework;
import java.util.*;
//add()
//add(2,element)
//addFirst() 
//addLast()
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("banana");
        list.add("apple");
        list.add("litchi");
        System.out.println("After insetion into linked list"+list);

        //adding an element to the beginning of the linked list
        list.addFirst("mango");
        System.out.println("After inserting to first position, list is "+list);

        //adding an element to the last of the linked list

        list.addLast("kiwi");
        System.out.println("After inserting element to the end of the linked list"+list);

        //adding an element at a specified position

        list.add(2,"pineapple");

        System.out.println("After inserting an element at specific position "+list);

        //Retrieveing first and last element of the LinkedList
        System.out.println(list.getLast());
        System.out.println(list.getFirst());

        //removing elements from the linkedList
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        // list.clear();
        // System.out.println(list);
        list.add("pineapple");

        //Searching an element in LinkedList

        //finding index of first occurence of a given element in a list
        System.out.println(list.indexOf("pineapple"));

        //finding index of last occurence of a given element in a list
        System.out.println(list.lastIndexOf("pineapple"));

        //iterating over linked list

        //using iterator
        Iterator itr=list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //using enchanced for loop
        for (String str:list){
            System.out.println();
        }

        //forEach loop, lambda expression

        list.forEach((element)->System.out.println(element));

        
    }
    
}
