package com.gla;

public class LibraryService {
    private LibraryRepository repo;

    public LibraryService(LibraryRepository repo) {
        this.repo = repo;
    }

    public void addBook(Book book) {
        repo.addBook(book);
        System.out.println("Book Added Successfully!");
    }

    public void showBooks() {
        if (repo.getAllBooks().isEmpty()) {
            System.out.println("No books available");
            return;
        }

        for (Book b : repo.getAllBooks()) {
            System.out.println(b);
        }
    }

    public void issueBook(int bookId) {
        for (Book b : repo.getAllBooks()) {
            if (b.getId() == bookId && !b.isIssued()) {
                b.setIssued(true);
                System.out.println("Book Issued Successfully!");
                return;
            }
        }
        System.out.println("Book not available!");
    }

    public void returnBook(int bookId) {
        for (Book b : repo.getAllBooks()) {
            if (b.getId() == bookId && b.isIssued()) {
                b.setIssued(false);
                System.out.println("Book Returned Successfully!");
                return;
            }
        }
        System.out.println("Invalid return!");
    }
}
