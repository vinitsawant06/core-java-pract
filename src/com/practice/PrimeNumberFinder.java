package com.practice;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        int myNum = 13;
        if(primeNumFinder(myNum)) {
            System.out.println("Number is prime number");
        } else {
            System.out.println("Number is not prime");
        }
    }

    static boolean primeNumFinder(int num) {
        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
