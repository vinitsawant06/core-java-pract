package com.java8features.durga.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicatDemo {

    public static void main(String[] args) {
//        Predicate<Integer> predicate = I -> I>10;
//        System.out.println(predicate.test(20));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number to check if it's odd or even");
        int number = scanner.nextInt();
        Predicate<Integer> predicate = I -> I%2 == 0;
        if(predicate.test(number)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        String name = "Vinit";
        scanner.nextLine();
        System.out.println("Enter your name to compare in database: ");
        String enteredName = scanner.nextLine();
        Predicate<String> predicate1 = S -> S.equals(name);
        if(predicate1.test(enteredName)) {
            System.out.println("Your name is enrolled!");
        } else System.out.println("You are not yet enrolled");
    }
}

