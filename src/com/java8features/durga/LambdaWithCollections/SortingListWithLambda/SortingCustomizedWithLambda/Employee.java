package com.java8features.durga.LambdaWithCollections.SortingListWithLambda.SortingCustomizedWithLambda;

public class Employee {

    String ename;
    int Eno;
    Employee( int eno, String ename) {
        this.Eno = eno;
        this.ename = ename;
    }
    public String toString() {
        return Eno+":"+ename;
    }
}
