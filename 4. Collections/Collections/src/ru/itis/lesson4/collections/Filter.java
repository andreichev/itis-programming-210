package ru.itis.lesson4.collections;

public interface Filter<T> {
    boolean decide(T item);
}
