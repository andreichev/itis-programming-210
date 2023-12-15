package org.example;

import org.example.model.PersonException;

public interface Person {
    Product doWork() throws PersonException;
}
