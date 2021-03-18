package com.java8features.durga.StudentGrade;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeSystem {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        // populate(students);
        StudentGrade studentGrade = student -> {
            double marks = student.marks;
            String grade = (marks >= 80) ? "A [Distinction]" :
                    (marks >= 60) ? "B [First Class]":
                            (marks >= 35) ? "C [Pass Class]":
                                    (marks < 35) ? "Fail":
                                            "No Grade Available";
            return grade;
        };
//        String grade = studentGrade.grade(students.get(0));
//        System.out.println("Your grade is: "+grade);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String yourName = scanner.nextLine();
        System.out.println("Enter you marks: ");
        double marksObtained = scanner.nextDouble();
        students.add(addStudent(yourName, marksObtained));

        for(Student student: students) {
            System.out.println("Student "+student.name+" recieved grade: "+studentGrade.grade(student));
        }



    }

//    private static void populate(ArrayList<Student> students) {
//        students.add(addStudent("Vinit", 83));
//        students.add(addStudent("Sam", 63.20));
//        students.add(addStudent("Ram", 35));
//        students.add(addStudent("Ron", 21.79));
//    }

    private static Student addStudent(String name, double marks) {
        return new Student(name, marks);
    }
}
