package com.bookclub.service;

import java.util.List;

public interface GenericCrudDao<E,K> {
    public List<E> list(K key); //Return a list of objects of type E.
    public E find(K key); //Return an object of type E by type K value.

    public void add(E entity); // Adds an object of type E where a match doesn't occur.
    public void update(E entity); // Updates an object of type E where a match occurs.
    public boolean remove(K key); //Removes an object of type E where a match occurs.
}
