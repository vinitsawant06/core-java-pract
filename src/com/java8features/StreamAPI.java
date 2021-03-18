package com.java8features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        ArrayList<String> myList = new
                ArrayList<>();
        myList.add("Vinit");
        myList.add("n/a");
        myList.add("Ravi");

        Stream<String> myStream = myList.stream();
        Stream<String> filteredValue = myStream.filter(value -> Boolean.parseBoolean(value = "n/a"));
        Stream<String> upperCase = myStream.map(value -> value.toUpperCase());
        System.out.println(filteredValue.findFirst());
        System.out.println(upperCase);
    }
}
