package ru.itis.basic_web_app.service;

public interface PasswordEncoder {
    String getHash(String password);
    boolean matches(String password, String hash);
}
