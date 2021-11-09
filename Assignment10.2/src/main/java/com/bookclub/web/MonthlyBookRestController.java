package com.bookclub.web;

import java.util.List;

import com.bookclub.model.BookOfTheMonth;
import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.BookOfTheMonthDao;
import com.bookclub.service.dao.WishlistDao;
import com.bookclub.service.impl.MongoBookOfTheMonthDao;
import com.bookclub.service.impl.MongoWishlistDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/monthlyBookList", produces="application/json")
@CrossOrigin(origins="*")
public class MonthlyBookRestController {
    
        private BookOfTheMonthDao bookOfTheMonthDao = new MongoBookOfTheMonthDao();
    
        @Autowired
        private void setBookOfTheMonthList(BookOfTheMonthDao bookOfTheMonthIn) {
            this.bookOfTheMonthDao = bookOfTheMonthIn;
    
        }
    
        @RequestMapping(method = RequestMethod.GET)
        private List<BookOfTheMonth> showBookOfTheMonthList(Authentication authentication) {
            String username = authentication.getName();
            return bookOfTheMonthDao.list(username);
        }
    
        @RequestMapping(path = "/{id}", method = RequestMethod.GET)
        public BookOfTheMonth findById(@PathVariable String id) {
            return bookOfTheMonthDao.find(id);
        }
    
}
