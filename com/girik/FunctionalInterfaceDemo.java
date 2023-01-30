package com.girik;
@FunctionalInterface
interface Abc{
    void show();

}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Abc obj=new Abc() {
        //     public void show(){
        //         System.out.println("I am the best ");
        //     }
        // };

        Abc obj=()-> {System.out.println("I am the best ");}; //with a functional interface, as there is only one function whose defintion is to be defined, so 
        Abc obj1=()-> System.out.println("I am the second best");
        obj.show();
        obj1.show();
    }
}
