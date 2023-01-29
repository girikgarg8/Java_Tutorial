package com.girik;
public class ExceptionDemo{
    public static void main(String[] args) {
        try{
            int i=7;
            int j=2;
            int k=i/j;
            System.out.println("output is "+k);
        }
        catch(ArithmeticException e){
            System.out.println( " Cannot divide by your zero  ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println (" Array index out of bound exception "); 
        }
        catch(Exception e){
            System.out.println(" Some other exception occured ");
        }
        finally{
            System.out.println (" Bye ");
        }
    }
}