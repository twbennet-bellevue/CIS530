package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookclub.dao.WishlistDao;
import com.bookclub.model.WishlistItem;

public class MemWishlistDao implements WishlistDao {
    
    private List<WishlistItem> wishlist = new ArrayList<WishlistItem>();

    public MemWishlistDao() {


        WishlistItem book1 = new WishlistItem("978-1492078005", "The Hobbit or There and Back Again");
        WishlistItem book2 = new WishlistItem("978-0261103573", "The Fellowship of the Ring");
        
        addWishlist(book1);
        addWishlist(book2);

    }

    public void addWishlist(WishlistItem itemIn) {
        this.wishlist.add(itemIn);
    }
    
    @Override
    public List<WishlistItem> list() {
        return this.wishlist;
    }

    @Override
    public WishlistItem find(String key) {
        for (WishlistItem item : this.wishlist) {
            if (item.getIsbn().equals(key)) {
                return item;
            }
        }
        return new WishlistItem();
    }
}
