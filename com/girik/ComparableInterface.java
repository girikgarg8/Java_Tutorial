package com.girik;
import java.util.*;

class Stud implements Comparable<Stud>{
    int rollNo,marks;
    String name;
    public Stud(int rollNo,String name,int marks){
        super();
        this.rollNo=rollNo;
        this.marks=marks;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Stud [rollNo= " +rollNo+ ", marks =" + marks+ " , name= " +name + "]"; /*
        toString is a method in Java that returns a string representation of an object. It is defined in the Object class, which is the superclass of all classes in Java. By default, the toString method returns a string in the format "ClassName@hashCode", where ClassName is the name of the class and hashCode is the hexadecimal representation of the hash code of the object.

However, it is a common practice to override the toString method in custom classes to provide a meaningful string representation of objects of that class. The string representation should contain the values of the fields that are relevant for the object's state. This can be useful for debugging and for printing the object's information.

For example, in the code you posted, the Stud class has overridden the toString method to return a string that includes the roll number, marks, and name of the student object.
        */
    }
    public int compareTo(Stud s){
        return name.length()>s.name.length()?1:-1;
    }
}
public class ComparableInterface {
    /*
     * The Comparable interface is a functional interface in Java that is used to
     * impose a total ordering on the objects of a class. It provides a single
     * method compareTo() that compares the current object with another object of
     * the same class and returns an integer value indicating the relative order of
     * the objects. A class that implements the Comparable interface must provide a
     * definition for the compareTo() method, which determines the order of the
     * objects. The objects of a class that implements Comparable can be sorted
     * using the sort() method of the Collections class or using the Arrays.sort()
     * method. The Comparable interface is often used in combination with the
     * Collections.sort() method to sort a list of objects.
     */
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(23, "Mahesh", 55));
        studs.add(new Stud(24, "Sony", 56));
        studs.add(new Stud(25, "ABCDEFGHIJKLMNIPP", 99));
        studs.add(new Stud(26, "A", 8));
        Collections.sort(studs,(i,j)->i.marks>j.marks?1:-1); //overriding the compareTo function defined in the class
        for (Stud s:studs){
            System.out.println(s);
        }
    }
}
