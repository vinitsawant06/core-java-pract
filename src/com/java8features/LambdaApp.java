package com.java8features;

interface functionalInt {
    int bookCab(int value);
    default void m1() {
        System.out.println("Default method");
    }
}


public class LambdaApp {
    int myValue = 100;
    static int sValue = 200;
    static LambdaApp lambdaApp = new LambdaApp();
    //functionalInt1 is not a name of Lambda, It's reference of functionalInt interface which is type for lambda expression
    private static functionalInt functionalInt1 = (value) -> {
        int localValue = 300;
        System.out.println("UberX booked!"+lambdaApp.myValue);
        System.out.println("Static Variable"+sValue);
        System.out.println("Local lambda value"+localValue);
        return value * localValue;
    };




    public static functionalInt fi = value -> value*value;
    public static void main(String[] args) {
        functionalInt1.bookCab(200);
        int value = fi.bookCab(20);
        System.out.println("Value of second lambda: "+value);
    }


}
