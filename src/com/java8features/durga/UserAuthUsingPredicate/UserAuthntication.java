package com.java8features.durga.UserAuthUsingPredicate;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthntication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<User> predicate = user -> user.userName.equalsIgnoreCase("Vinit")
                && user.pwd.equals("Pass@123");
        System.out.println("Enter your username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter your password: ");
        String pwd = scanner.nextLine();
        User user = new User(userName, pwd);
        if(predicate.test(user)) {
            System.out.println("User is valid!");
        } else System.out.println("User is invalid");
    }
}
