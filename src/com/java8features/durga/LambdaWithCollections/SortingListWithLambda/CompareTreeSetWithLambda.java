package com.java8features.durga.LambdaWithCollections.SortingListWithLambda;

import java.util.TreeSet;

public class CompareTreeSetWithLambda {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>((I1,I2) -> (I1>I2) ? -1 : (I1<I2) ? 1 : 0);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        System.out.println("TreeSet after compare: " + treeSet);

    }
}
