package com.java8features.durga.FunctionFunctionalInterface;

import java.util.function.Function;

interface Test {
    String spaceRem(String s);
}

interface Test1 {
    int spaceCount(String s);
}

public class StringSpaceRemover {
    public static void main(String[] args) {
        String name = "My Name is Vinit";
        //Using Function functional interface
        Function<String, String> stringSpaceRemover = s -> s.replaceAll(" ", "");
        String replacedName = stringSpaceRemover.apply(name);
        System.out.println(replacedName);

        //Using customer defined functional interface
        Test test = s -> s.replaceAll(" ", "");
        System.out.println(test.spaceRem(name));

        //Count number of space in string
        Function<String, Integer> spaceCounter = s -> s.length() - s.replaceAll(" ", "").length();
        int spaceCount = spaceCounter.apply(name);
        System.out.println("Spaces present: "+ spaceCount);

        //Count number of space in string using custom functional interface
        Test1 test1 = s -> s.length() - s.replaceAll(" ", "").length();
        int spaceCountCustom = test1.spaceCount(name);
        System.out.println("Count With custom: "+spaceCountCustom);

    }
}
