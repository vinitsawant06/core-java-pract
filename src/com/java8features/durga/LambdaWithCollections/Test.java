package com.java8features.durga.LambdaWithCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(0);
        arrayList.add(100);
        System.out.println("Before Sorting: "+arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting: "+arrayList);
        arrayList.sort(new MyComparator());
        System.out.println("After customized sorting: "+arrayList);



    }
}
