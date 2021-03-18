package com.practice;

import java.util.Scanner;

public class EvenOddDigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int oddCount=0;
        int evenCount=0;
        while (number>0) {
            int rem = number%10;
            System.out.println(rem);
            if(rem % 2 == 0) {
                evenCount++;
            } else if(rem%2 !=0) {
                oddCount++;
            }
            number = number/10;
        }
        System.out.println("Event digits in number: "+evenCount);
        System.out.println("Odd digits in number: "+oddCount);
    }
}
