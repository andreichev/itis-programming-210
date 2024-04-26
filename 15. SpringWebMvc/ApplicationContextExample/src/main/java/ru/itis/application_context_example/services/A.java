package ru.itis.application_context_example.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class A {
    private final B b;

    public String getMessage() {
        return b.getMessage() + " AND A";
    }
}
