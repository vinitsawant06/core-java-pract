package com.java8features.durga.StreamAPI;

abstract class Shape {
   abstract double getArea();
}

public class Test extends Shape {

    double radius =10;
    @Override
    double getArea() {
        return 2*Math.PI*radius;
    }
}
