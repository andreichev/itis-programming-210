package ru.itis.java_web.session_example.repository.base;

import java.util.Optional;

public interface CrudRepository<T, K> {
    T save(T item);
    Optional<T> getById(K id);
    void delete(K id);
}
