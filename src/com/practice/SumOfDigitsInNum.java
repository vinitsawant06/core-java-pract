package com.practice;

import java.util.Scanner;

public class SumOfDigitsInNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int incrementalNumber=0;
        while (number>0) {
            int digit = number%10;
            incrementalNumber = incrementalNumber + digit;
            number = number/10;
        }
        System.out.println("Sum of all digits in number: "+incrementalNumber);
    }
}
