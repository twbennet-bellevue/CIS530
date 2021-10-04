package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookclub.dao.BookDao;
import com.bookclub.model.Book;

public class MemBookDao implements BookDao {

    private List<Book> books = new ArrayList<Book>();

    public MemBookDao() {
        //Add five new Book objects

        List<String> authors = new ArrayList<String>();
        authors.add("Eric Freeman");
        authors.add("Elisabeth Robson");
        Book book1 = new Book("978-1492078005", "Head First Design Patterns", "Building Extensible & Maintainable Object-Oriented Software", 5102, authors);
        

        authors = new ArrayList<String>();
        authors.add("Test");
        authors.add("Test2");
        Book book2 = new Book("7-2592-2402-1", "Database Management", "SQL Server Database Management", 6100,authors);

        authors = new ArrayList<String>();
        authors.add("Test");
        authors.add("Test2");
        Book book3 = new Book("978-0134757599", "Refactoring:", "Improving the Design of Existing Code", 901, authors);

        authors = new ArrayList<String>();
        authors.add("Test");
        authors.add("Test2");
        Book book4 = new Book("978-0201616224", "The Pragmatic Programmer", "The Pragmatic Programmer: From Journeyman to Master", 1024, authors);

        authors = new ArrayList<String>();
        authors.add("Robert C. Martin");
        authors.add("Test2");
        Book book5 = new Book("978-0132350884", "Clean Code", "Clean Code: A Handbook of Agile Software Craftmanship", 5102, authors);

        addBook(book1);
        addBook(book2);
        addBook(book3);
        addBook(book4);
        addBook(book5);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> list() {
        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(key)) {
                return book;
            }
        }
        return new Book();
    }
}
