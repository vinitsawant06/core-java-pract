package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class XpanxionInterview {
    public static void main(String[] args) {
        List<Character> charList= Arrays.asList('I','Z','A','A','E','A');
        HashSet<Character> charSet = new HashSet<>();
        for(char element : charList) {
            if(element == 'A' || element == 'E' || element == 'I' || element == 'O' || element == 'U') {
                charSet.add(element);
                        }
                    }
        for(char element : charSet) {
            System.out.println(element);
        }
    }
}
