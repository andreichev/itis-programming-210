package ru.itis.lesson4.collections.impl;

import ru.itis.lesson4.collections.XList;

import java.util.Iterator;

public class XLinkedList<T> implements XList<T> {
    private static class Node<T> {
        T x;
        Node<T> next;

        Node(T x) {
            this.x = x;
            this.next = null;
        }
    }

    private Node<T> root = null;
    private int count = 0;

    @Override
    public void add(T x) {
        if(root == null) {
            root = new Node<T>(x);
            count++;
            return;
        }
        Node<T> current = root;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<T>(x);
        count++;
    }

    @Override
    public void remove(int index) {
        // TODO: Реализовать
    }

    @Override
    public T get(int index) {
        Node<T> current = root;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.x;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO: Реализовать
        return null;
    }
}
