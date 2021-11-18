package com.bookclub.web;

import java.util.List;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;
import com.bookclub.service.impl.MongoWishlistDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/wishlist", produces="application/json")
@CrossOrigin(origins="*")
public class WishlistRestController {

    private WishlistDao wishlistDao = new MongoWishlistDao();

    @Autowired
    private void setWishlist(WishlistDao wishlistIn) {
        this.wishlistDao = wishlistIn;

    }

    @RequestMapping(method = RequestMethod.GET)
    private List<WishlistItem> showWishlist(Authentication authentication) {
        String username = authentication.getName();
        return wishlistDao.list(username);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public WishlistItem findById(@PathVariable String id) {
        return wishlistDao.find(id);
    }
}
