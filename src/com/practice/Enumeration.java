package com.practice;

class MyClass {
    Enumeration.Days days;
    String name;

    MyClass(Enumeration.Days days, String name) {
        this.days = days;
        this.name = name;
    }
}

public class Enumeration {
    enum Days {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    public static void main(String[] args) {
        MyClass myClass = addEmployee(Days.Monday, "Vinit");
        System.out.println("Employee Name: "+myClass.name);
        System.out.println("Employee Day is: "+ myClass.days);

    }
    private static MyClass addEmployee(Days day , String Ename) {
        return new MyClass(day, Ename);
    }
}
