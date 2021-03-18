package com.java8features.durga.LambdaWithCollections.SortingListWithLambda;

import java.util.TreeMap;

public class CompareTreeMapWithLambda {

    public static void main(String[] args) {
        TreeMap<Integer, String> ts = new
                TreeMap<>((I1, I2) -> (I1>I2)?-1:(I1<I2)?1:0);
        ts.put(100, "Vinit");
        ts.put(200, "Aniker");
        ts.put(300, "Sam");
        ts.put(400, "Nou");
        System.out.println(ts);

    }
}
