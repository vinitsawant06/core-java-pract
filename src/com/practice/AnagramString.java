package com.practice;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String firstString = "listen";
        String secondString = "silent";

        char[] firstChar = firstString.toCharArray();
        char[] secondChar = secondString.toCharArray();
        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        if(Arrays.equals(firstChar, secondChar)) {
            System.out.println("It's an Anagram string");
        } else {
            System.out.println("Not an Anagram string");
        }
    }
}
