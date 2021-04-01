package Acce.innerclasses;

public class NestedInnerClass {
    class Nested {
        public void show() {
            System.out.println("Inner class!");
        }

    }
}

class Main {
    public static void main(String[] args) {
        NestedInnerClass.Nested nested = new NestedInnerClass().new Nested();
        nested.show();
    }
}