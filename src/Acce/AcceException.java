package Acce;

import java.util.Scanner;

public class AcceException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a or b or c:");
        String resp = scanner.nextLine();
        try{
            switch (resp) {
                case "a":
                    System.out.println("Result success!");
                    break;
                case "b":
                    throw new Exception("B exception");
                case "c":
                    throw new Exception("C exception");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
