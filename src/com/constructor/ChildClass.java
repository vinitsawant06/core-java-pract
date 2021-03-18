package com.constructor;

public class ChildClass {
    int value1;
    String valueString;
    ChildClass(int value1, String valueString) {
        this.value1 = value1;
        this.valueString = valueString;
        System.out.println(value1);
        System.out.println(valueString);
    }

    public ChildClass() {
        System.out.println("Parent class constructor!");
    }
}
