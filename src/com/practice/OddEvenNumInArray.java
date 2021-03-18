package com.practice;

public class OddEvenNumInArray {
    public static void main(String[] args) {
        int myArray[] = {2,3,4,5,6,7,8,9};
        System.out.print("Even numbers: ");
        for(int i = 0 ; i<myArray.length; i++) {
            if(myArray[i]%2 ==0) {
                System.out.print(myArray[i]+ " ");
            }
        }
        System.out.print("\nOdd numbers: ");
        for(int i = 0 ; i<myArray.length; i++) {
            if(myArray[i]%2 !=0) {
                System.out.print(myArray[i]+ " ");
            }
        }
    }
}
