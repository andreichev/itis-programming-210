package org.example.impl;

import org.example.Person;
import org.example.Product;
import org.example.Work;
import org.example.model.Money;
import org.example.model.PersonException;

public class YandexWork implements Work {
    @Override
    public Money doWork(Person person) {
        System.out.println("Работа в Яндекс");
        Product product = null;
        while (product == null) {
            try {
                product = person.doWork();
            } catch (PersonException e) {
                System.out.println("Произошел конфуз, дать отпуск " + e.getMessage());
            }
        }
        System.out.println("Получен продукт " + product);
        return new Money(2000000, "RUB");
    }
}
