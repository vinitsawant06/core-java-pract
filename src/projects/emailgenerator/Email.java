package projects.emailgenerator;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String company;
    private String email;
    private String changedPassword;

    //Contructor to receive first and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for: " + this.firstName + " " + this.lastName);

        //Call setDepartment
        this.department = setDepartment();
        System.out.println("Department for " + firstName + " " + lastName + " is: " + this.department);

        //Call a method to generate password
        this.password = generatePassword(8);
        System.out.println("Your password is: " + this.password);

        //Call a method to set company
        this.company = setCompany();
        System.out.println("Your company is: " + this.company);

        //Call a method to generate Email

        this.email = setEmail();
        System.out.println("Your email id is: " + this.email);

        //Call a method to store a changed password
        this.changedPassword = getChangedPassword();

    }

    //Ask for the Department

    private String setDepartment() {
        System.out.print("Choose department codes\n1 for Sales\n2 for IT\n3 for Finance\nEnter code here:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return "Sales";
            case 2:
                return "IT";
            case 3:
                return "Finance";
            default:
                return "None";
        }

    }

    //Generate random password

    private String generatePassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWZYZ0123456789@&%$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomValue = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
        }

        return new String(password);
    }

    //Set company name

    private String setCompany() {
        System.out.println("Enter you company: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //Generated Email

    private String setEmail() {
        return (this.firstName).toLowerCase() + "." + (this.lastName).toLowerCase()
                + "@" + (this.department).toLowerCase() + "." + (this.company).toLowerCase() + ".com";
    }

    //Store a user password

    private String getChangedPassword() {
        System.out.println("Do you want to change your password? (y/n):  ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        String newPassword = "";
        switch (choice) {
            case "y":
                System.out.println("Enter your password: ");
                newPassword = scanner.nextLine();
                System.out.println("New password is set!");
                break;
            case "n":
                System.out.println("New password is not set! Please use system generated password");
                break;
            default:
                System.out.println("New password is not set! Please use system generated password");
                break;
        }
        return newPassword;
    }
}
