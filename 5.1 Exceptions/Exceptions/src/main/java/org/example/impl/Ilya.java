package org.example.impl;

import org.example.Person;
import org.example.Product;
import org.example.model.PersonException;

public class Ilya implements Person {
    @Override
    public Product doWork() throws PersonException {
        if(Math.random() > 0.5) {
            throw new PersonException("Забухал");
        }
        return new Program();
    }
}
