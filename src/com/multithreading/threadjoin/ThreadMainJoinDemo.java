package com.multithreading.threadjoin;


public class ThreadMainJoinDemo {

    public static void main(String[] args) {
        System.out.println("**********Wedding function****************");
        ThreadJoinMethodVenue threadJoinMethodVenue = new ThreadJoinMethodVenue();
        Thread venueThread = new Thread(threadJoinMethodVenue); //new state or born state
        venueThread.start(); // Ready state or runnable state
        ThreadJoinMethodPrintingCards threadJoinMethodPrintingCards = new ThreadJoinMethodPrintingCards();
        Thread cardsPrintingThread = new Thread(threadJoinMethodPrintingCards);
        try {
            venueThread.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        cardsPrintingThread.start();
        ThreadJoinMethodCardsDistribution threadJoinMethodCardsDistribution = new ThreadJoinMethodCardsDistribution();
        Thread cardsDistributionThread = new Thread(threadJoinMethodCardsDistribution);
        try{
            cardsPrintingThread.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        cardsDistributionThread.start();

    }
}
