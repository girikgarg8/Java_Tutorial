package com.girik;

public class RunnableWithAnonymousExpression {
    public static void main(String[] args) {
        // Runnable obj1 = ()->{
        //             for (int i = 1; i <= 5; i++)
        //                 System.out.println("Hi Ruunable Running");
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (Exception e) {

        //             }
        // };
        // Runnable obj2 =()->{
        //         for (int i = 1; i <= 5; i++)
        //             System.out.println("Hello Runnable Running");
        //         try {
        //             Thread.sleep(1000);
        //         } catch (Exception e) {

        //         }
        // };
        Thread t1 = new Thread(()->{
                    for (int i = 1; i <= 5; i++)
                        System.out.println("Hi Ruunable Running");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++)
                System.out.println("Hello Runnable Running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }); // creating objects of thread class
        t1.start(); // we can pass an object of runnable into thread object's constructor
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();
    }
}
