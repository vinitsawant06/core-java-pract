package com.practice;

public class Fibonassi {
    public void fibonassiSeries(int firstNumber) {
        int count = 10;
        int secondNumber = firstNumber*2;
        System.out.print(firstNumber+" "+secondNumber);
        while (count >=0) {
            int nextNum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNum;
            count--;
            System.out.print(" "+nextNum);
        }
    }
}
