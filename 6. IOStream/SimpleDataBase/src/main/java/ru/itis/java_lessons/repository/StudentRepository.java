package ru.itis.java_lessons.repository;

import ru.itis.java_lessons.core.CrudRepository;
import ru.itis.java_lessons.model.Student;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    // List<Student> findAllAgeMoreThan(int n);
}
