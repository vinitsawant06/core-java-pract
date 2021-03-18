package com.practice;

public class FactorialOfNum {
    public static void main(String[] args) {

//        int testNum = 5;
//        int tempValue = 3;
//        System.out.println(tempValue*(testNum--));
//        System.out.println(testNum);

        int myNum =4;
        long temp =1;
        while (myNum>0) {
            temp = temp*(myNum--);
        }
        System.out.println(temp);
    }
}
