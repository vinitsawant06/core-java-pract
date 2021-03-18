package com.java8features.durga.BiFunctionBiCosumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeImpl {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        BiFunction<String, Double, Employee> employeeBiFunction = (Ename, Esalary) -> addEmploye(Ename, Esalary);
        employees.add(employeeBiFunction.apply("Vinit", 50000.0));
        employees.add(employeeBiFunction.apply("Sam", 5000.0));
        employees.add(employeeBiFunction.apply("Ron", 12000.0));
        BiConsumer<Employee, Double> biConsumer = (employee, increment) -> employee.salary = employee.salary + increment;
        for(Employee employee : employees) {
            biConsumer.accept(employee, 500.0);
        }
        for(Employee employee : employees) {
            System.out.println(employee.name);
            System.out.println(employee.salary);
        }

    }

    public static Employee addEmploye(String name, double salary) {
        return new Employee(name, salary);
    }
}
