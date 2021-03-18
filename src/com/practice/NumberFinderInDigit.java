package com.practice;

import java.util.Scanner;

public class NumberFinderInDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int count = 0;
        while (number>0) {
            number = number/10;
            count ++;

        }
        System.out.println(count);

    }
}
