package ru.itis.java_web.session_example.repository.impl;

import ru.itis.java_web.session_example.model.User;
import ru.itis.java_web.session_example.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryMemoryImpl implements UserRepository {
    List<User> users = new ArrayList<>();
    private Long increment = 0L;

    @Override
    public User save(User item) {
        if(item.getId() == null) {
            item.setId(++increment);
            users.add(item);
            return item;
        } else {
            Optional<User> optionalUser = getById(item.getId());
            if(optionalUser.isEmpty()) {
                return item;
            }
            optionalUser.get().setName(item.getName());
            return item;
        }
    }

    @Override
    public Optional<User> getById(Long id) {
        return users.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return users.stream()
                .filter(item -> item.getName().equals(username))
                .findFirst();
    }

    @Override
    public void delete(Long id) {
        users.removeIf(item -> item.getId().equals(id));
    }
}
