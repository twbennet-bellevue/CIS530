package com.bookclub.service;

import java.util.List;

public interface GenericDao<E,K> {
    public List<E> list(K key); //Return a list of objects of type E.
    public E find(K key); //Return an object of type E by type K value.
}
