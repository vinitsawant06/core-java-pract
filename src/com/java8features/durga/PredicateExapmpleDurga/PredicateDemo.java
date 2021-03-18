package com.java8features.durga.PredicateExapmpleDurga;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        int[] x = {0, 5, 10, 20, 25, 30};
        Predicate<Integer> p1 = I -> I > 10;
        Predicate<Integer> p2 = I -> I % 2 == 0;
        System.out.println("Numbers in array which are greater than 10 are: ");
        m1(p1, x);
        System.out.println("Numbers in array which are Even numbers: ");
        m1(p2, x);
        System.out.println("Numbers in array which are not greater than 10 are: ");
        m1(p1.negate(), x);
        System.out.println("Numbers in array which are greater than 10 AND are Even: ");
        m1(p1.and(p2), x);
        System.out.println("Numbers in array which are greater than 10 OR are Even: ");
        m1(p1.or(p2), x);

        String[] names = {"vinit", "Ka", "Ki", "Sam"};
        Predicate<String> startsWithK = S -> S.charAt(0) == 'K';
        for(String value:names) {
            if(startsWithK.test(value)) {
                System.out.println(value);
            }
        }

        String[] names1 = {"Vinit", " ", null, "Sam", "Ron"};
        Predicate<String> predicate = S -> S.length() != 0 && S != null;
        ArrayList<String> al = new ArrayList<>();
        for(String name: names1) {
            if(predicate.test(name)) {
                al.add(name);
            }
        }
    }
    private static void m1(Predicate<Integer> predicate, int[] intArray) {
        for(int value: intArray) {
            if(predicate.test(value)) {
                System.out.println(value);
            }
        }
    }
}
