package com.java8features.durga.lambdapractdelete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(22);
        myList.add(30);
        myList.add(43);

        List<Integer> newList = myList.stream().map(I -> I*2).collect(Collectors.toList());
        System.out.println(newList);

        String name = "Fifer has aaaaa";
        List<String> list= Arrays.stream(name.split(" ")).filter(I -> I.length() ==5).collect(Collectors.toList());
        System.out.println(list);
    }
}
