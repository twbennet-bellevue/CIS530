package com.bookclub.model;

public class Book {
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private String infoUrl;

    public Book() {
        this.isbn = "";
        this.title = "";
        this.description = "";
        this.numOfPages = 0;
        this.infoUrl = "";
    }

    public Book(String isbn, String title, String description, String infoUrl, int numOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.numOfPages = numOfPages;
        this.infoUrl = infoUrl;
    }

    public Book(String isbn, String title, String infoUrl) {
        this.isbn = isbn;
        this.title = title;
        this.infoUrl = infoUrl;
    }

    public String getInfoUrl() {
        return this.infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
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

    @Override
    public String toString() {
        String temp = "Book{isbn=<" + this.isbn + ">," +
                      "title=<" + this.title + ">," +
                      "description=<" + this.description +">," +
                      "infoUrl=<" + this.infoUrl + ">," +
                      "numOfPages=<" + this.numOfPages + ">" + 
                      "}";
        return temp;
    }

}