package com.java8features.durga.StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFirstProgEvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(0);
        myList.add(5);
        myList.add(12);
        myList.add(25);
        myList.add(20);
        myList.add(15);
        System.out.println("Original List is: "+myList);


        //Even numbers without Streams
        ArrayList<Integer> myListWithoutStreams = new ArrayList<>();
        for(int value : myList) {
            if(value %2 == 0) {
                myListWithoutStreams.add(value);
            }
        }
        System.out.println("Even filtered list without streams: "+myListWithoutStreams);

        //Even numbers with Streams. Filter: it uses predicate functional interfae
        List<Integer> myListWithStreams = myList.stream().filter(I -> I%2 == 0).collect(Collectors.toList());
        /*
        if we use ArrayList then we need to cast
        ArrayList<Integer> myListWithStreams = (ArrayList<Integer>) myList.stream().filter(I -> I%2 ==0).collect(Collectors.toList());
         */
        System.out.println("Even filtered list with Streams: "+myListWithStreams);

        //Map method: it uses Function functional interface
        List<Integer> myListWithStreamMap = myList.stream().map(I -> I*2).collect(Collectors.toList());
        System.out.println(myListWithStreamMap);

        //Stream Object
        //Stream stream =  myList.stream().filter(I -> I%2 == 0);


        //By passing Function in map
        Function<Integer, Integer> myFunction = integer -> integer*5;
        for(int value: myList) {
            myFunction.apply(value);
        }

        List<Integer> myListWithFunction = myList.stream().map(myFunction).collect(Collectors.toList());
        System.out.println(myListWithFunction);

        //By passing Predicate in filter
        Predicate<Integer> myPredicate = i -> i%5 ==0;
        for(int value: myList) {
            myPredicate.test(value);
        }

        List<Integer> myListWithPredicate = myList.stream().filter(myPredicate).collect(Collectors.toList());
        System.out.println(myListWithPredicate);

        //Count method
        long count = myList.stream().filter(I -> I%2 ==0).count();
        System.out.println(count);


        //Sorting with sorted() : Natural sorting i.e. Ascending

        List<Integer> sortedList = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //Sorting with sorted(Comparator C) i.e. Descending
        List<Integer> sortedListCustom = myList.stream().sorted((i1, i2) -> i2.compareTo(i1)).
                collect(Collectors.toList());
        //Or List<Integer> sortedListCustom = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedListCustom);

        Integer min = myList.stream().min(Integer::compareTo).orElse(null);
        System.out.println(min);


        //forEach()
        myList.stream().forEach(System.out::println);

        //Optional to check if list is nullable
        List<Integer> myOptionalList =Optional.of(myList).map(Collection::stream)
                .map(stream -> stream.collect(Collectors.toList())).orElse(myListWithFunction);
        System.out.println(myOptionalList);

        //toArray()
        Integer[] array = myList.stream().toArray(Integer[]::new);
        for(Integer value: array) {
            System.out.println(value);
        }

        //Stream.of() for group of values
        Stream<Integer> stream = Stream.of(9, 99, 999, 9999);
        stream.forEach(System.out::println);

        //Stream.of() for arrays
        Double[] doubles = {10.0, 10.1, 10.2, 10.3, 10.4};
        Stream<Double> doubleStream = Stream.of(doubles);
        doubleStream.forEach(System.out::println);
    }
}
