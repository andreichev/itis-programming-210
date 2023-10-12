package ru.itis.java_lessons.core;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, K> {
    /*
    * Saves new T or updates existing if id is not null
    * */
    T save(T item);
    Optional<T> findById(K id);
    List<T> getAll();
    void delete(K id);
}
