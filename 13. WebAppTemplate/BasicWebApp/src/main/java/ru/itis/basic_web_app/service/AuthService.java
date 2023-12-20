package ru.itis.basic_web_app.service;

import ru.itis.basic_web_app.dto.SignInForm;
import ru.itis.basic_web_app.dto.SignUpForm;
import ru.itis.basic_web_app.dto.UserDto;
import ru.itis.basic_web_app.exceptions.AuthException;

public interface AuthService {
    UserDto signIn(SignInForm form) throws AuthException;
    UserDto signUp(SignUpForm form) throws AuthException;
}
