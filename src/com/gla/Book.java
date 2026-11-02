package com.gla;

public class Book {
    private int id;
    private String title;
    private String author;
    private String department;
    private Category category;
    private boolean isIssued;

    public Book(int id, String title, String author,String department, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.department = department;
        this.category = category;
        this.isIssued = false;
    }
    public int getId() {
        return id;
    }
    public boolean isIssued() {
        return isIssued;
    }
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + author + " " + department + " "  + category + " " + " " + " Issued: " + isIssued;
    }
}
