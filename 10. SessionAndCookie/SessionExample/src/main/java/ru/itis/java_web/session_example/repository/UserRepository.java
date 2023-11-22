package ru.itis.java_web.session_example.repository;

import ru.itis.java_web.session_example.model.User;
import ru.itis.java_web.session_example.repository.base.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> getByUsername(String username);
}
