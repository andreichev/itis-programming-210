package ru.itis.basic_web_app.service.impl;

import ru.itis.basic_web_app.service.PasswordEncoder;

public class PasswordEncoderImpl implements PasswordEncoder {
    @Override
    public String getHash(String password) {
        // TODO: Implement
        return password;
    }

    @Override
    public boolean matches(String password, String hash) {
        // TODO: Implement
        return password.equals(hash);
    }
}
