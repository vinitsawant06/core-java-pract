package com;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InterviewCode {
    public static void main(String[] args) {

        //To find out 5 letters words in sentence
        String sentence = "I am bored of fifer";
        int count = 0;
        String[] fiveLettersWord = sentence.split(" ");
        for(String word: fiveLettersWord) {
            if(word.length() == 5) {
                count++;
            }
        }
        System.out.println("No. of words with five letters: "+count);

        //try-catch-finally block
        System.out.println(exceptionMethod());
    }
    public static String exceptionMethod() {
        try {
            return  "Try block";
        } catch (Exception e) {
            return "Catch block";
        } finally {
            return "Finally block";
        }
    }
}
