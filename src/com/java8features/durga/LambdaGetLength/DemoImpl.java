package com.java8features.durga.LambdaGetLength;


import java.util.Scanner;

@FunctionalInterface
interface Interf {

    int getLength(String myString);

}

public class DemoImpl{

    public static Interf interf = (myString) -> myString.length();

    // Using method reference
    // public static Interf interf = String::length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string to find length");
        String myString = scanner.nextLine();
        int lengthOfString = interf.getLength(myString);
        System.out.println(lengthOfString);
    }
}
