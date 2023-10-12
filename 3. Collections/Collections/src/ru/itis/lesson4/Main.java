package ru.itis.lesson4;

import ru.itis.lesson4.collections.XList;
import ru.itis.lesson4.collections.XMap;
import ru.itis.lesson4.collections.XSet;
import ru.itis.lesson4.collections.impl.XArrayList;
import ru.itis.lesson4.collections.impl.XHashMap;
import ru.itis.lesson4.collections.impl.XHashSet;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        XList<String> list = new XArrayList<>();
        list.add("ASDFFDFD");
        list.add("ABCD");
        list.add("FDGKLKDKFL");
        for (String x: list) {
            System.out.println(x);
        }

        XList<Integer> list1 = new XArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(2);
        list1.add(45);
        list1.add(100);
        XList<Integer> filtered1 = list1.filtered(x -> x % 2 == 0);
        for (Integer x: filtered1) {
            System.out.println(x);
        }
        XList<Integer> filtered2 = list1.filtered(x -> x > 10);
        for (Integer x: filtered2) {
            System.out.println(x);
        }

        XMap<String, Integer> map = new XHashMap<>();
        map.put("Misha", 26);
        map.put("Ilnaz", 21);
        map.put("Ivan", 16);
        map.put("Šon", 25);

        System.out.println(map.get("Ilnaz"));

        XSet<Integer> set = new XHashSet<>();
        set.insert(1);
        set.insert(1);
        set.insert(1);
        set.insert(2);
        set.insert(2);
        set.insert(2);
        set.insert(3);
        set.insert(3);
        set.insert(3);
        set.insert(3);

        System.out.println(set.size());
    }
}