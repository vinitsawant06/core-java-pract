package com.project.library;

import java.util.Scanner;

public class LibraryServiceImplementation implements LibraryService {
    Scanner scanner = new Scanner(System.in);
    public void SaveBook() {

        System.out.println("Enter Book Name: ");
        String bookName = scanner.nextLine();
        System.out.println("Enter quantities of book: ");
        int bookQuantity = scanner.nextInt();
        System.out.println("You have added "+bookQuantity + " "+bookName+" books");

    }
    public void GetBook() {
        System.out.println("Get book");
    }
    public void ShowBookAvailability() {
        System.out.println("Show book");
    }

    public static void main(String[] args) {
        LibraryServiceImplementation libraryServiceImplementation = new LibraryServiceImplementation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your option: ");
        System.out.println("1. Add book");
        System.out.println("2. Display book");
        System.out.println("3. Show book");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1: libraryServiceImplementation.SaveBook();
                     break ;
            case 2: libraryServiceImplementation.GetBook(); break;
            case 3: libraryServiceImplementation.ShowBookAvailability(); break;
            case 4: break;

        }
    }
}
