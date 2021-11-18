package com.bookclub.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class TestBook {
    
    //@Mock
    private Book book;
    private static String isbn;
    private static String title;
    private static String description;
    private static int numOfPages;
    private static String infoUrl;
    

    @BeforeAll
    public static void init() {
        isbn = "0000000000";
        title = "Dune";
        description = "A story about spice";
        numOfPages = 500;
        infoUrl = "test.com";
    }

    
    @Test
    void testCreateNewBook() {
        Book book = new Book(isbn, title, description, infoUrl, numOfPages);
        assertEquals(isbn, book.getIsbn());
    }

    @Test
    void testBookToString() {
        Book book = new Book(isbn, title, description, infoUrl, numOfPages);
        String result = String.format("Book{isbn=%s, title=%s, description=%s, infoUrl=%s, numOfPages=%s}", isbn, title, description, infoUrl, numOfPages);
        assertEquals(result, book.toString());
    }

}
