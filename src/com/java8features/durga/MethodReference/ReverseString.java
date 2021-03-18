package com.java8features.durga.MethodReference;

interface ReverseService {
    String reverseString(String s);
}

public class ReverseString {
    public static String reverseAString(String s) {
        String reverseString = "";
        char[] myString = s.toCharArray();
        for(int i = s.length()-1; i>=0; i--) {
            reverseString = reverseString + myString[i];
        }
        return reverseString;
    }
    public static void main(String[] args) {
        ReverseService reverseService = ReverseString::reverseAString;
        String reverseString = reverseService.reverseString("Vinit");
        System.out.println(reverseString);

    }
}
