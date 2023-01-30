package com.girik;
class Hi extends Thread{
    public void run(){
        for (int i=1;i<=5;i++) System.out.println("Hi Running");
        try{Thread.sleep(1000);} 
        catch(Exception e){

        }
    }
} 

class HelloThread extends Thread{
    public void run() {
        for (int i=1;i<=5;i++) System.out.println("Hello Running");
        try{Thread.sleep(1000);}
        catch(Exception e){

        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1=new Hi();
        HelloThread obj2=new HelloThread();
        obj1.start(); //using start() method from Thread enables us to have multithreading running, internally, using start() always call the run() method (run() is the start point of any Thread )4
        try{Thread.sleep(10);} catch(Exception e){} //It might sometimes happen that order of Hi and Hello is not strictly alternate, this is due to the fact that when two competing processes reach the scheduler at the same time, the OS uses several factors to determine which thread should execute first, so it can be possible that thread of obj2 gets a chance first than obj1
        obj2.start(); 
        //obj1.run();
        //obj2.run();
    }
}
