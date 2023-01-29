package com.girik;
abstract class Human{
    public abstract void eat();
    public void walk(){

    }
}
class Man extends Human{ //this class is known as concrete class
    public void eat(){
        System.out.println("Man eating");
    }
}
public class AbstractKeywordDemo {
    public static void main(String[] args) {
        //Human obj=new Human();
        Human obj=new Man();
        obj.eat();
    }
}
