package ru.itis.basic_web_app.repository;

import ru.itis.basic_web_app.model.User;
import ru.itis.basic_web_app.repository.base.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
