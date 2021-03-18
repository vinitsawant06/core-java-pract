package com.java8features.durga.lambdafirsteg;


public class FunctInterfServiceImpl {

    public FunctiInterfService fs = (firstValue, secondValue) -> System.out.println(firstValue + secondValue);

    public static void main(String[] args) {
        int firstValue = 20;
        int secondValue = 30;
        FunctInterfServiceImpl functInterfService = new FunctInterfServiceImpl();
//        FunctiInterfService functiInterfService = (Value1, Value2) -> System.out.println(Value1 + Value2);
        functInterfService.fs.m1(firstValue, secondValue);
    }
}
