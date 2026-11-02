package com.gla;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class LibraryRepository {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
