package com.girik;

public class JoinAndisAliveMethod {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(()->{
                    for (int i = 1; i <= 5; i++)
                        System.out.println("Hi Ruunable Running "+Thread.currentThread().getPriority());
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }
        },"Hi runnable ");
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++)
                System.out.println("Hello Runnable Running "+Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }," Hello runnable "); // creating objects of thread class

        // t1.setName("HiThread");
        // t2.setName("HelloThread");
        t1.setPriority(Thread.MIN_PRIORITY); //assigns priority of 1 to the thread
        t2.setPriority(Thread.MAX_PRIORITY); //assigns priority of 10 to the thread
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getName()); //1 has least priority and 10 has most priority in the case of threads
        System.out.println(t2.getName());
        t1.start(); // we can pass an object of runnable into thread object's constructor
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
