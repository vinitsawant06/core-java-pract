package projects.emailgenerator;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        Email email = new Email(firstName, lastName);
    }
}
