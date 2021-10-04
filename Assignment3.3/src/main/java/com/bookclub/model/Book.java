package com.bookclub.model;

import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private List<String> authors;

    public Book() {
        this.isbn = "";
        this.title = "";
        this.description = "";
        this.numOfPages = 0;
    }

    public Book(String isbn, String title, String description, int numOfPages, List<String> authors) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.numOfPages = numOfPages;
        this.authors = authors;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        String temp = "Book{isbn=<" + this.isbn + ">," +
                      "title=<" + this.title + ">," +
                      "description=<" + this.description +">," +
                      "numOfPages=<" + this.numOfPages + ">," + 
                      "authors=<" + this.authors + "}";
        return temp;
    }

}