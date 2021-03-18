package com.practice;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] myArray = {10,20,30,40,50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to search: ");
        int searchElement = scanner.nextInt();
        int counter = 0;
        for(int element: myArray) {
            if(element == searchElement) {
                counter++;
            }
        }
        if(counter>0) {
            System.out.println(searchElement+" is present in an Array");
        } else {
            System.out.println(searchElement+" is not present in an Array");
        }
    }
}
