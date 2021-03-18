package com.practice;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicatNumInArray {
    public static void main(String[] args) {
        int[] myArray = {20,30,40,20,20,40};
        System.out.print("Duplicate Numbers in array: ");
//        for (int i=0; i<myArray.length; i++) {
//            for(int j = i + 1; j<myArray.length; j++) {
//                if(myArray[i] == myArray[j]) {
//                    System.out.println(myArray[i]);
//                    break;
//                }
//            }
//
//        }
        HashSet<Integer> hashSet = new HashSet<>();
        for(int element: myArray) {
            if (!hashSet.add(element)) {
                System.out.print(element+" ");
            }
        }
    }
}
