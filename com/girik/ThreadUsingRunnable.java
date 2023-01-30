package com.girik;

class HiRunnable implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Hi Ruunable Running");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Hello Runnable Running");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }
}
public class ThreadUsingRunnable {
    public static void main(String[] args) {
        HiRunnable obj1 = new HiRunnable();
        HelloRunnable obj2 = new HelloRunnable();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2); // creating objects of thread class
        t1.start(); //we can pass an object of runnable into thread object's constructor
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();   
    }
}
