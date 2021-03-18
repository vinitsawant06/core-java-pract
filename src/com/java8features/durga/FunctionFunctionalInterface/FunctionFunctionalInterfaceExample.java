package com.java8features.durga.FunctionFunctionalInterface;

import java.util.function.Function;

public class FunctionFunctionalInterfaceExample {
    public static void main(String[] args) {
        String name = "Vinit";
        Function<String, Integer> function = s -> s.length();
        int length = function.apply(name);
        System.out.println(length);

        Function<String, String> reverseFunction = s -> {
            char[] charArray = s.toCharArray();
            StringBuilder reverseString = new StringBuilder();
            for(int i=charArray.length-1; i>=0; i--) {
                reverseString.append(charArray[i]);
            }
            return reverseString.toString();
        };
        String reverseString = reverseFunction.apply(name);
        System.out.println(reverseString);
    }
}
