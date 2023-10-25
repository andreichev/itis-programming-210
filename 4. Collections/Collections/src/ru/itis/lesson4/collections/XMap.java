package ru.itis.lesson4.collections;

public interface XMap<K, V> {
    void put(K key, V value);
    V get(K key);
    void remove(K key);
    int size();
}
