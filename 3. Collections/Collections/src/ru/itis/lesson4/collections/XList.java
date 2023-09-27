package ru.itis.lesson4.collections;

import java.util.Iterator;

public interface XList<T> extends Iterable<T> {
    void add(T x);
    void remove(int index);
    T get(int index);
    int size();

    @Override
    Iterator<T> iterator();
}
