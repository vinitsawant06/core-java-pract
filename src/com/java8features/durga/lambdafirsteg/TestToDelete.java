package com.java8features.durga.lambdafirsteg;

interface FunctionalInterfService {
    double area(double radius);
}

public class TestToDelete {

    public static void main(String[] args) {
        double radius = 10;
        FunctionalInterfService functionalInterfService = (r) -> r*r;
        System.out.println(functionalInterfService.area(radius));

    }
}
