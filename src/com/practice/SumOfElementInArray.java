package com.practice;

public class SumOfElementInArray {
    public static void main(String[] args) {
        int myArray[] = {1,3,5,7,6,9};
        int length = myArray.length-1;
        int SumOfArray = 0;
        while (length>=0) {
            SumOfArray = SumOfArray + myArray[length];
            length--;
        }
        System.out.println(SumOfArray);
    }
}
