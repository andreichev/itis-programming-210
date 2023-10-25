package ru.itis.lesson4.collections;

import java.util.Iterator;

public interface XSet<T> extends Iterable<T> {
    void insert(T value);
    void remove(T value);
    boolean contains(T value);
    int size();

    @Override
    Iterator<T> iterator();
}
