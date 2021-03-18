package com.practice;

public class FactorialUsingRecursion {
    static long fact = 1;
    public static void main(String[] args) {
        long factorial = getFactorial(6);
        System.out.println(factorial);
    }
    private static long getFactorial(int number) {
        if(number >= 1) {
            fact = fact * number;
            getFactorial(number-1);
            return fact;
        } else {
            return 1;
        }
    }
}
