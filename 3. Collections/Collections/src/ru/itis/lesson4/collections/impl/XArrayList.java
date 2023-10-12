package ru.itis.lesson4.collections.impl;

import ru.itis.lesson4.collections.Filter;
import ru.itis.lesson4.collections.XList;

import java.util.Iterator;

public class XArrayList<T> implements XList<T> {
    class XIterator<E> implements Iterator<E> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public E next() {
            return (E) data[index++];
        }
    }

    private Object[] data = new Object[2];
    private int count = 0;
    private int capacity = 2;

    public XArrayList(int capacity) {
        reserve(capacity);
    }

    public XArrayList() {}

    @Override
    public void add(T x) {
        if(count >= capacity) {
            reserve(capacity * 2);
        }
        data[count] = x;
        count++;
    }

    @Override
    public void remove(int index) {
        // TODO: Реализовать
    }

    @Override
    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public XList<T> filtered(Filter<T> filter) {
        XList<T> newList = new XArrayList<>();
        for (T item : this) {
            if(filter.decide(item)) {
                newList.add(item);
            }
        }
        return newList;
    }

    @Override
    public int size() {
        return count;
    }

    public void reserve(int capacity) {
        if(capacity > this.capacity) {
            this.capacity = capacity;
            System.out.println("RESIZED ARRAY. NEW CAPACITY " + capacity);
            Object[] newData = new Object[capacity];
            if (count >= 0) {
                System.arraycopy(data, 0, newData, 0, count);
            }
            data = newData;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new XIterator<>();
    }
}
