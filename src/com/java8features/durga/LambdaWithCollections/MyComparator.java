package com.java8features.durga.LambdaWithCollections;


import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    public int compare(Integer I1, Integer I2) {
        return (I1>I2)?-1:(I1<I2)?1:0;
        //return I2.compareTo(I1);
    }
}
