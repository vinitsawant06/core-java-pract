package com.generics;

import java.util.ArrayList;

class MyClass <T> {
    T value;
    MyClass(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}

public class GenericClassPract {
    public static void main(String[] args) {
        MyClass<String> stringMyClass = new MyClass<>("Vinit");
        System.out.println(stringMyClass.getValue());
        MyClass<Integer> integerMyClass = new MyClass<>(10);
        System.out.println(integerMyClass.getValue());
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        MyClass<ArrayList<Integer>> arrayListMyClass = new MyClass<>(myList);
        System.out.println(arrayListMyClass.getValue());

    }
}
