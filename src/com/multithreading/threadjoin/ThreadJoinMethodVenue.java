package com.multithreading.threadjoin;

import java.util.Scanner;

public class ThreadJoinMethodVenue implements Runnable {
     String Venue;
    public void run() {
        System.out.println("Started to fixing the Venue!!!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your wedding venue: ");
        Venue = scanner.nextLine();
        System.out.println("Venue has been finalized: "+Venue);
    }
}
