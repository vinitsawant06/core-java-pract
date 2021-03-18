package com.practice;

public class ReverseString {

    public String reverseStrValue(String string) {
        String reverseString = "";
        char[] myChar = string.toCharArray();
        for(int i = myChar.length-1; i>=0; i--) {
            reverseString = reverseString + myChar[i];
        }
        return reverseString;
    }
}
