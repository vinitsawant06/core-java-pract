package com.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Reverse Number");
        ReverseNum reverseNum = new ReverseNum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to reverse: ");
        int userValue = scanner.nextInt();
        int myReverseValue = reverseNum.reverse(userValue);
        System.out.println("Reverse Number is: " +myReverseValue);
        System.out.println("###################################################################");

        scanner.nextLine();
        System.out.println("2. Reverser String");
        ReverseString reverseString = new ReverseString();
        System.out.println("Enter String to Reverse:");
        String userString = scanner.nextLine();
        String reverseStr = reverseString.reverseStrValue(userString);
        System.out.println("Reverse String is: "+reverseStr);
        System.out.println("#########################################################");

        System.out.println("3. Pallindrom Number");
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        reverseNum.pallindromNum(firstNum);
        scanner.nextLine();
        System.out.println("######################################################");

        System.out.println("3. Fibonassi Series");
        System.out.println("Enter Number to start fibonassi series: ");
        int fibonassiNum = scanner.nextInt();
        Fibonassi fibonassi = new Fibonassi();
        fibonassi.fibonassiSeries(fibonassiNum);


    }
}
