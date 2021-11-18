package com.bookclub.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.*;

public class TestWishlistItem {
    
    //@Mock
    private WishlistItem wishlist;
    private static String id;
    private static String isbn;
    private static String title;
    private static String username;
    

    @BeforeAll
    public static void init() {
        
        isbn = "000000000000";
        title = "Dune Part 2";
        username = "admin-tbennet";
    }

    @Test
    void testCreateNewWishlistItemWithUsername() {
        WishlistItem item = new WishlistItem(isbn, title, username);
        assertEquals(id, item.getId());
        assertEquals(isbn, item.getIsbn());
        assertEquals(title, item.getTitle());
        assertEquals(username, item.getUsername());
    }

    @Test
    void testCreateNewWishlistItemWithoutUsername() {
        WishlistItem item = new WishlistItem(isbn, title);
        assertEquals(id, item.getId());
        assertEquals(isbn, item.getIsbn());
        assertEquals(title, item.getTitle());
        assertNotEquals(username, item.getUsername());
    }

    @Test
    void testWishlistItemToString() {
        WishlistItem item = new WishlistItem(isbn, title);
        String result = String.format("WishlistItem{id=%s, isbn=%s, title=%s, username=%s", null, isbn, title, null);
        assertEquals(result, item.toString());

        WishlistItem item2 = new WishlistItem(isbn, title, username);
        result = String.format("WishlistItem{id=%s, isbn=%s, title=%s, username=%s", null, isbn, title, username);
        assertEquals(result, item2.toString());

    }
}
