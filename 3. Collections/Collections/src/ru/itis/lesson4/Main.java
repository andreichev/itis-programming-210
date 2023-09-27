package ru.itis.lesson4;

import ru.itis.lesson4.collections.XSet;
import ru.itis.lesson4.collections.impl.XArrayList;
import ru.itis.lesson4.collections.impl.XHashMap;
import ru.itis.lesson4.collections.XList;
import ru.itis.lesson4.collections.XMap;
import ru.itis.lesson4.collections.impl.XHashSet;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XList<String> list = new XArrayList<>();
        list.add("ASDFFDFD");
        list.add("ABCD");
        list.add("FDGKLKDKFL");
        for (String x: list) {
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