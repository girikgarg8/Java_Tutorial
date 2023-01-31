package com.girik;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List <Integer> values= new ArrayList <>();
        values.add(4);  //this is not primitive data type int, this is Integer wrapper class Integer v=new Integer(4)
        /*
                        * However, the iterator does not directly point to 4 when it is created. You
                        * need to call the next() method to get the first element. The initial position
                        * of the iterator is before the first element, so you need to call next() once
                        * before accessing the first element.
                        */
        values.add(5);
        values.add(9);
        values.add(2,8); //add element 8 at 2nd index of the element

        //In order to iterate over the collection, I can't directly access any index in Collection 
        Iterator it=values.iterator();

        // while (it.hasNext()){
        //     System.out.println(it.next());
        // }

        for (int i=0;i<values.size();i++){
            System.out.println(values.get(i));
        }
        
        for (Integer o:values){
            System.out.println(o);
        }
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
    }
}
