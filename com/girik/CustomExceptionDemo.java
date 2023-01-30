package com.girik;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int i,j;
        i=8;
        j=9;
        try{
            int k=i/j;
            if (k==0) throw new GirikException("Zero value not allowed "); //I am creating an object of Exception class and throwing it
            System.out.println(k);
        }
        catch(GirikException e){
            System.out.println("Error " +e.getMessage()); //getMessage() is due to the fact that the girikException class extends Exception class and Exception class has the implementation of getMessage() function
        }    
    }
}
