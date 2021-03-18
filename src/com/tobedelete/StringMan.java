package com.tobedelete;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMan {

    public static void main(String[] args) {
        String name = "vinit";
        String secondName = "vin";
        char[] firstNameArray = name.toCharArray();
        char[] secondNameArray = secondName.toCharArray();
        Arrays.sort(firstNameArray);
        Arrays.sort(secondNameArray);
        if(Arrays.equals(firstNameArray, secondNameArray)) {
            System.out.println("Anagram String");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
