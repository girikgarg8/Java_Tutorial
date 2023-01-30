package com.girik;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println(" Enter a number ");
        Scanner scn = new Scanner(System.in); // system.in is preffered over inputstreamreader anf buffered reader
                                              // because of the easier syntax of Scanner, here system.in specifies that
                                              // we'll be taking input from the input stream (keyboard) instead of a
                                              // file
        int n = scn.nextInt(); // using nextInt has the davnatge that it automatically converts the character
                               // stream to number, and handles the excpetion too
        System.out.println(n);
    }
}
