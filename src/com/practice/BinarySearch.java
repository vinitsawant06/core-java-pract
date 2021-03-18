package com.practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        /*
        It is important to have sorted array for binary search
         */
        // int[] myArray = {10,20,30,40,50,60,70,80,90,100};
        int[] myArray = {34, 21, 5, 40, 60 , 2, 200, 9};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        int searchElement = 2;
        int low = 0;
        int high = myArray.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(searchElement == myArray[mid]) {
                System.out.println("Element found at index: "+mid);
                break;
            } else if(searchElement < myArray[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
            if (low > high) {
                System.out.println("Element not found!");
            }
        }
    }
}
