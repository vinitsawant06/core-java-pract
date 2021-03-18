package com.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

public static void main(String[] args) {
    int[] myArray = {60,50,40,30,20,10};
    int lengthOfArray = myArray.length;
    System.out.println("Before sorting, array is: "+ Arrays.toString(myArray));
    for(int i=0; i<lengthOfArray-1; i++) {
        for(int j=0; j<lengthOfArray-1; j++) {
            if(myArray[j]>myArray[j+1]) {
                int temp = myArray[j];
                myArray[j] = myArray[j+1];
                myArray[j+1] = temp;
            }
        }
        System.out.println("After "+(i+1)+" pass, Array is: "+Arrays.toString(myArray));
    }
    System.out.println("Sorted array is: "+ Arrays.toString(myArray));
}

}
