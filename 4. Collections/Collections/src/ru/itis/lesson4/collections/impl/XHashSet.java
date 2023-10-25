package ru.itis.lesson4.collections.impl;

import ru.itis.lesson4.collections.XMap;
import ru.itis.lesson4.collections.XSet;

import java.util.Iterator;

public class XHashSet<T> implements XSet<T> {
    private class XIterator<E> implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }

    private final XMap<T, Object> data = new XHashMap<>();
    private final Object o = new Object();

    @Override
    public void insert(T value) {
        data.put(value, o);
    }

    @Override
    public void remove(T value) {
        data.remove(value);
    }

    @Override
    public boolean contains(T value) {
        return data.get(value) != null;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public Iterator<T> iterator() {
        // TODO: Реализовать
        return null;
    }
}
