package com.girik;

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) throws Exception{
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable(){
            public void run(){
                for (int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join(); //expected output is 2000, but it is not so, reason is that both the threads are executing in parallel in different cores of the CPU, so the instruction count++ actually executes as count=count+1, if t1 and t2 both read the value of count as 0 at the same time, so they increment the value of count to 1 but ideally it should have been 2 after two executing two count operations, so for preventing this I use synchronized keyword 
        System.out.println("Count "+c.count);
    }
}
