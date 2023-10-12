package ru.itis.java_lessons.repository.impl;

import ru.itis.java_lessons.model.Student;
import ru.itis.java_lessons.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

public class StudentRepositoryCsvImpl implements StudentRepository {
    @Override
    public Student save(Student item) {
        // TODO: Implement
        return null;
    }

    @Override
    public Optional<Student> findById(Long id) {
        // TODO: Implement
        return Optional.empty();
    }

    @Override
    public List<Student> getAll() {
        // TODO: Implement
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO: Implement
    }
}
