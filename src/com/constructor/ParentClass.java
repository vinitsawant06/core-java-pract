package com.constructor;


public class ParentClass extends ChildClass {
    //parametrized constructor
    ParentClass(int Value1, String stringValue) {
        super(Value1, stringValue);
    }
    //No-arg constructor
    ParentClass() {
        super(); //Reference to parent constructor
        System.out.println("No-arg Constructor!");
    }
    public static void main(String[] args) {
        // ChildClass childClass = new ChildClass(10, "Vinit");
        ParentClass parentClass = new ParentClass(10, "vinit");
        int myNumber = parentClass.value1;
        String name = parentClass.valueString;
        System.out.println(name + " " + myNumber);
        new ParentClass();
        new ChildClass();
    }
}
