package ru.itis.application_context_example.services;

import org.springframework.stereotype.Component;

@Component
public class B {
    public String getMessage() {
        return "HELLO FROM B";
    }
}
