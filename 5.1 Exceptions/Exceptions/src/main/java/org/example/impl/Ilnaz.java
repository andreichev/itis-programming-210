package org.example.impl;

import org.example.Person;
import org.example.Product;

public class Ilnaz implements Person {
    @Override
    public Product doWork() {
        return new Program();
    }
}
