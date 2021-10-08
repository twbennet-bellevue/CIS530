package com.bookclub.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class WishlistItem {
    @NotNull
    @NotEmpty(message = "ISBN is a required field.")
    private String isbn;
    
    @NotNull
    @NotEmpty(message = "Title is a required field.")
    private String title;

    public WishlistItem() {
        this.isbn = "000";
        this.title = "default";
    }

    public WishlistItem(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "WishlistItem{=<" + this.isbn + ">, title=<" + this.title + ">}";
    }

}
