package com.girik;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
public class SetInterface {
    public static void main(String[] args) {
        Set <Integer> st=new HashSet<>(); //set is the interface and Hashset is the class that implmenets that interface, hashset in Java is like unordered set of C++
        st.add(97);
        st.add(93);
        st.add(87);
        st.add(95);
        for (int i:st){
            System.out.println(i);
        }
        System.out.println("Printing for treeset now ");
        Set <Integer> st1=new TreeSet<>(); //TreeSet in Java is like ordered set of Java
        st1.add(982);
        st1.add(99322);
        st1.add(29292);
        for (int i:st1){
            System.out.println(i);
        }
    }
}
