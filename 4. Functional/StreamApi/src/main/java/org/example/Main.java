package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(12);
        list.add(24);

        List<String> processed = list.stream()
                .filter(x -> x > 5)
                .sorted((a, b) -> a - b)
                .distinct()
                .map(x -> x + " PARROTS")
                .toList();

        for (String x : processed) {
            System.out.println(x);
        }
    }
}