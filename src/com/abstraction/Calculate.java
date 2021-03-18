package com.abstraction;

abstract class Shape {
   abstract double area();
   abstract String StringConvert();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 2*Math.PI*(radius*radius);
    }

    public String StringConvert(){
        return "Area of circle is: "+ area();
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length*width;
    }
    public String StringConvert(){
        return "Area of rectangle is: "+ area();
    }
}

public class Calculate {
    public static void main(String[] args) {
        Shape CircleArea = new Circle(10);
        Shape RectangleArea = new Rectangle(5,4);
        System.out.println(CircleArea.StringConvert()+" and "+RectangleArea.StringConvert());

    }
}
