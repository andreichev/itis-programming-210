package ru.itis.basic_web_app.repository.impl;

import ru.itis.basic_web_app.model.User;
import ru.itis.basic_web_app.repository.UsersRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersRepositoryImpl implements UsersRepository {
    private final Connection connection;

    private final static String SQL_SELECT_ALL = "select * from users;";
    private final static String SQL_INSERT = "insert into users (username, email, course_name, password_hash) VALUES (?, ?, ?, ?);";
    private final static String SQL_UPDATE = "update users set username = ?, email = ?, course_name = ?, password_hash = ? where id = ?;";
    private final static String SQL_SELECT_BY_ID = "select * from users where id = ?;";
    private final static String SQL_SELECT_BY_USERNAME = "select * from users where username = ?;";

    public UsersRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_USERNAME);
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()) {
                return Optional.empty();
            }

            User user = User.builder()
                    .id(resultSet.getLong("id"))
                    .username(resultSet.getString("username"))
                    .email(resultSet.getString("email"))
                    .courseName(resultSet.getString("course_name"))
                    .passwordHash(resultSet.getString("password_hash"))
                    .build();
            return Optional.of(user);
        } catch (SQLException throwable) {
            System.out.println("SQL Exception: " + throwable.getLocalizedMessage());
        }

        return Optional.empty();
    }

    @Override
    public Optional<User> findById(Long id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_ID);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()) {
                return Optional.empty();
            }

            User user = User.builder()
                    .id(resultSet.getLong("id"))
                    .username(resultSet.getString("username"))
                    .email(resultSet.getString("email"))
                    .courseName(resultSet.getString("course_name"))
                    .build();
            return Optional.of(user);
        } catch (SQLException throwable) {
            System.out.println("SQL Exception: " + throwable.getLocalizedMessage());
        }

        return Optional.empty();
    }

    @Override
    public List<User> findALl() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> result = new ArrayList<>();
            while(resultSet.next()) {
                User user = User.builder()
                        .id(resultSet.getLong("id"))
                        .username(resultSet.getString("username"))
                        .courseName(resultSet.getString("course_name"))
                        .email(resultSet.getString("email"))
                        .passwordHash(resultSet.getString("password_hash"))
                        .build();
                result.add(user);
            }
            return result;
        } catch (SQLException throwable) {
            System.out.println("SQL Exception: " + throwable.getLocalizedMessage());
        }
        return new ArrayList<>();
    }

    @Override
    public User save(User item) {
        if (item.getId() == null) {
            try {
                PreparedStatement statement = connection.prepareStatement(
                        SQL_INSERT, new String[]{"id"}
                );
                statement.setString(1, item.getUsername());
                statement.setString(2, item.getEmail());
                statement.setString(3, item.getCourseName());
                statement.setString(4, item.getPasswordHash());
                int affectedRows = statement.executeUpdate();
                System.out.println(affectedRows + " rows affected");
                ResultSet generatedKeys = statement.getGeneratedKeys();
                generatedKeys.next();
                item.setId(generatedKeys.getLong(1));
                return item;
            } catch (SQLException throwable) {
                System.out.println("SQL Exception: " + throwable.getLocalizedMessage());
            }
            return item;
        } else {
            try {
                PreparedStatement statement = connection.prepareStatement(
                        SQL_UPDATE
                );
                statement.setString(1, item.getUsername());
                statement.setString(2, item.getEmail());
                statement.setString(3, item.getCourseName());
                statement.setString(4, item.getPasswordHash());
                statement.setLong(5, item.getId());
                int affectedRows = statement.executeUpdate();
                System.out.println(affectedRows + " rows affected");
                return item;
            } catch (SQLException throwable) {
                System.out.println("SQL Exception: " + throwable.getLocalizedMessage());
            }
            return item;
        }
    }

    @Override
    public void deleteById(Long id) {
        // TODO: Реализовать
    }
}
