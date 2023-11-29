package ru.itis.database3;

import java.util.List;

public interface UsersRepository extends CrudRepository<User, Integer> {
    List<ru.itis.database2.User> getByCourseName(String courseName);
}
