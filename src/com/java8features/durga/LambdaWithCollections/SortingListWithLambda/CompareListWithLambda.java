package com.java8features.durga.LambdaWithCollections.SortingListWithLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompareListWithLambda {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(0);
        arrayList.add(100);
        System.out.println("Before sorting: "+arrayList);
        Collections.sort(arrayList, (I1, I2) -> (I1>I2)?-1:(I1<I2)?1:0);
        System.out.println("After customized sorting: "+arrayList);

        String afterValue = "After String Value";
        String beforeValue = "Before String Value";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        //Ternary operator
        String value = (a>b)?beforeValue:(a<b)?afterValue:null;
        System.out.println(value);

    }
}
