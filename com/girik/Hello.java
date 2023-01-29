package com.girik;
class Calc{
    int num1;
    int num2;
    int result;
    public Calc(){
        num1=5;
        num2=5;
    }
    public Calc(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void perform(){
        result=num1+num2;
    }
}
public class Hello{
    public static void main(String[] args) {
        int num=5; //takes 4 bytes
        byte b=5; //1 byte
        num=8;
        long l=500000000l;//8 bytes
        double percent=5.5;
        float percent1=5.5f;
        short s=5; //2 bytes
        char c=66;
        int k=(int)5.6;
        // System.out.println(c);
        Calc obj=new Calc(5,6);  //obj is object reference
        // obj.num1=3;
        // obj.num2=4;
        obj.perform(); 
        System.out.println(obj.result);
    }
}