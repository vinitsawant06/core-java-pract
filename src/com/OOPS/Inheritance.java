package com.OOPS;


class Test {
    public static void main(String[] args) {
        try {
            int a = 3;
            int b = 0;
            int c = a / b;
            System.out.println("Result is: " + c);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception are handled");
//        }
//
        }catch (ArithmeticException | NumberFormatException ae) {
            ae.printStackTrace();
        }
    }
}
