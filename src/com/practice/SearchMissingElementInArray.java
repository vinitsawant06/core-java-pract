package com.practice;

public class SearchMissingElementInArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,5,6,7};
        int sumOfArray = 0;
        int n = myArray.length+1;
        int sumOfRange = n*(n+1)/2;
        for(int element: myArray) {
            sumOfArray = sumOfArray + element;
        }
        int missingValue = sumOfRange - sumOfArray;
        System.out.println("Missing Value is: "+missingValue);

    }
}
