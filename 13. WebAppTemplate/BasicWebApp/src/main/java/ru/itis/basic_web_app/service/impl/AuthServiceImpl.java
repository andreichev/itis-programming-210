package ru.itis.basic_web_app.service.impl;

import lombok.RequiredArgsConstructor;
import ru.itis.basic_web_app.dto.SignInForm;
import ru.itis.basic_web_app.dto.SignUpForm;
import ru.itis.basic_web_app.dto.UserDto;
import ru.itis.basic_web_app.exceptions.AuthException;
import ru.itis.basic_web_app.model.User;
import ru.itis.basic_web_app.repository.UsersRepository;
import ru.itis.basic_web_app.service.AuthService;
import ru.itis.basic_web_app.service.PasswordEncoder;

import java.util.Optional;

@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDto signIn(SignInForm form) throws AuthException {
        // TODO: Валидация формы
        Optional<User> existingUser = usersRepository.findByUsername(form.getUsername());
        if(existingUser.isEmpty()) {
            throw new AuthException("Пользователь с таким именем не найден");
        }
        User user = existingUser.get();
        if(!passwordEncoder.matches(form.getPassword(), user.getPasswordHash())) {
            throw new AuthException("Неверный пароль");
        }
        return UserDto.builder()
                .username(user.getUsername())
                .courseName(user.getCourseName())
                .email(user.getEmail())
                .build();
    }

    @Override
    public UserDto signUp(SignUpForm form) throws AuthException {
        // TODO: Валидация формы
        Optional<User> existingUser = usersRepository.findByUsername(form.getUsername());
        if(existingUser.isPresent()) {
            throw new AuthException("Пользователь с таким именем уже существует");
        }
        User user = User.builder()
                .username(form.getUsername())
                .email(form.getEmail())
                .courseName(form.getCourseName())
                .passwordHash(passwordEncoder.getHash(form.getPassword()))
                .build();
        User savedUser = usersRepository.save(user);
        System.out.println("SAVED USER WITH ID " + savedUser.getId());
        return UserDto.builder()
                .username(savedUser.getUsername())
                .courseName(savedUser.getCourseName())
                .email(savedUser.getEmail())
                .build();
    }
}
