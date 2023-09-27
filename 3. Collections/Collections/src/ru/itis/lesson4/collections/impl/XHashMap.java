package ru.itis.lesson4.collections.impl;

import ru.itis.lesson4.collections.XList;
import ru.itis.lesson4.collections.XMap;

public class XHashMap<K, V> implements XMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity = 20;
    private int count = 0;
    private final XArrayList<XList<Node<K, V>>> data = new XArrayList<>(capacity);

    public XHashMap() {
        for (int i = 0; i < capacity; i++) {
            data.add(new XLinkedList<>());
        }
    }

    @Override
    public void put(K key, V value) {
        int index = key.hashCode() % capacity;
        XList<Node<K, V>> list = data.get(index);
        for (int i = 0; i < list.size(); i++) {
            Node<K, V> node = list.get(i);
            if(node.key == key) {
                node.value = value;
                return;
            }
        }
        count++;
        list.add(new Node<>(key, value));
    }

    @Override
    public V get(K key) {
        int index = key.hashCode() % capacity;
        XList<Node<K, V>> list = data.get(index);
        for (int i = 0; i < list.size(); i++) {
            Node<K, V> node = list.get(i);
            if(node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    @Override
    public void remove(K key) {
        // TODO: Реализовать
    }

    @Override
    public int size() {
        return count;
    }
}
