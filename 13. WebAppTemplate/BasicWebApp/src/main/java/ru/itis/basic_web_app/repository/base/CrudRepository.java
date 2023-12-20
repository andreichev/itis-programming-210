package ru.itis.basic_web_app.repository.base;

import java.util.List;
import java.util.Optional;

/// T - сущность
/// K - первичный ключ
public interface CrudRepository<T, K> {
    Optional<T> findById(K id);
    List<T> findALl();
    // Сохранение и обновление
    T save(T item);
    void deleteById(K id);
}
