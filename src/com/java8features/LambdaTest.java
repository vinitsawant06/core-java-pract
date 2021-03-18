package com.java8features;

interface MyInt
{
    int add(int value1, int value2);
}
public class LambdaTest {

    static MyInt addNumeber = (firstValue, secondValue) -> {
        System.out.println(firstValue + secondValue);
        return firstValue + secondValue;
    };
    public static void main(String[] args) {
        addNumeber.add(20, 30);
    }

}
