package com.practice;

import java.util.Scanner;

public class SwapNum {
    public static void main (String[] args) {
        System.out.println("Class swapnum main method");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Before swapping, x="+firstNum+"and y="+secondNum);
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("After swapping, x="+firstNum+"and y="+secondNum);

    }
}
