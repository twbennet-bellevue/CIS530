package com.bookclub.service.impl;

import com.bookclub.model.BookOfTheMonth;
import com.bookclub.service.dao.BookOfTheMonthDao;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.QueryLookupStrategy.Key;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookOfTheMonthDao")
public class MongoBookOfTheMonthDao implements BookOfTheMonthDao {
    

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void add(BookOfTheMonth entity) {
        mongoTemplate.save(entity);
    }

    
    @Override
    public void update(BookOfTheMonth entity) {
        BookOfTheMonth bookOfTheMonth = mongoTemplate.findById(entity.getId(), BookOfTheMonth.class);

        if(bookOfTheMonth != null) {
            bookOfTheMonth.setId(entity.getId());
            bookOfTheMonth.setIsbn(entity.getIsbn());
            bookOfTheMonth.setMonth(entity.getMonth());

            mongoTemplate.save(bookOfTheMonth);
        }
    }

    @Override
    public boolean remove(String key) {
        Query query = new Query();

        query.addCriteria(Criteria.where("id").is(key));

        mongoTemplate.remove(query, BookOfTheMonth.class);

        return true;
    }

    @Override
    public List<BookOfTheMonth> list(String key) {
        int month = Integer.parseInt(key);

        System.out.println("Month: " + month);
        if(month == 999) {
            return mongoTemplate.findAll(BookOfTheMonth.class);

        }
        
        Query query = new Query();
        query.addCriteria(Criteria.where("month").is(month));

        return mongoTemplate.find(query, BookOfTheMonth.class);
    }

    @Override
    public BookOfTheMonth find(String key) {
        return mongoTemplate.findById(key, BookOfTheMonth.class);
    }
}
