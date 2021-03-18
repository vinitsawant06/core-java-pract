package com.java8features;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class OptionalValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        //Optional is introduced in Java8 of utility package
        Optional<String> value = Optional.ofNullable(name);
        if(value.isPresent()) {
            System.out.println("Value present");
        } else {
            System.out.println("No value present");
        }

        //DateTimeFormatter introduced in Java8 of time package
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss zzz");
        String expires = ZonedDateTime.now(ZoneId.of("CET")).plusYears(5).format(formatter);
        System.out.println("Expires: "+expires);

    }
}
