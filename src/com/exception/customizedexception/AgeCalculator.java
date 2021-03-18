package com.exception.customizedexception;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if(age > 60) {
            throw new TooOldException("Too young for this role!");
        } else if(age < 18) {
            throw new TooYoungException("Too Young for this role!");
        } else {
            System.out.println("Perfect age for this role!");
        }
    }
}
