package com.girik;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.*;


class MySort implements Comparator<Integer> { //creating a class that implements the Comparator interface

    @Override
    public int compare(Integer a,Integer b){
        if (a/10>b/10) return 1;
        return -1;
    }

}
public class CollectionDemo {
    public static void main(String[] args) {
        List <Integer> values= new ArrayList <>(); //Mutable
        values.add(108);  //this is not primitive data type int, this is Integer wrapper class Integer v=new Integer(4)
        /*
                        * However, the iterator does not directly point to 4 when it is created. You
                        * need to call the next() method to get the first element. The initial position
                        * of the iterator is before the first element, so you need to call next() once
                        * before accessing the first element.
                        */
        values.add(509);
        values.add(904);
        values.add(2,803); //add element 8 at 2nd index of the element


        // Collections.sort(values);
        Collections.reverse(values);
        Collections.shuffle(values); //shuffles the list elements in descending order
        //In order to iterate over the collection, I can't directly access any index in Collection 

        //Implmenting custom comparator to sort the values according to last digit, comparator in Java is an interface , so we can create an object of this interface by using anonymous class

        Comparator <Integer> obj=new Comparator <Integer> (){
            public int compare(Integer i,Integer j){
                if (i%10>j%10) return 1;
                else return -1;
            }
        };
        Iterator it=values.iterator();


        Collections.sort(values,(i,j)->i%10>j%10?1:-1); //shorthand for writing the comparator
        Collections.sort(values,obj);
        // while (it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for (int i=0;i<values.size();i++){
        //     System.out.println(values.get(i));
        // }
        
        for (Integer o:values){
            System.out.println(o);
        }
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());

        Collections.sort(values,new MySort());
        System.out.println(values);
    }
}
