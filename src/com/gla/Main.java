package com.gla;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryRepository repo = new LibraryRepository();
        LibraryService service = new LibraryService(repo);

        while (true) {
            System.out.println("\n### LIBRARY MANAGEMENT ###");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n** ADMIN MENU **");
                    System.out.println("1. Add Book");
                    System.out.println("2. View Books");

                    int adminChoice = sc.nextInt();

                    if (adminChoice == 1) {
                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        System.out.print("Enter department: ");
                        String department = sc.nextLine();

                        Book book = new Book(id, title, author, department, Category.OTHER);
                        service.addBook(book);

                    } else if (adminChoice == 2) {
                        service.showBooks();
                    }
                    break;

                case 2:
                    System.out.println("\n@@ STUDENT DETAIL @@");
                    System.out.println("1. Issue Book");
                    System.out.println("2. Return Book");

                    int studentChoice = sc.nextInt();

                    if (studentChoice == 1) {
                        System.out.print("Enter Book ID: ");
                        int bookId = sc.nextInt();
                        service.issueBook(bookId);

                    } else if (studentChoice == 2) {
                        System.out.print("Enter Book ID: ");
                        int bookId = sc.nextInt();
                        service.returnBook(bookId);
                    }
                    break;

                case 3:
                    System.out.println("Thank you");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
