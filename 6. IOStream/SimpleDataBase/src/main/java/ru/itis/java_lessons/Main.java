package ru.itis.java_lessons;

import ru.itis.java_lessons.model.Student;
import ru.itis.java_lessons.repository.StudentRepository;
import ru.itis.java_lessons.repository.impl.StudentRepositoryCsvImpl;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepositoryCsvImpl();

        System.out.println("Введите имя студента");
        String name = scanner.nextLine();
        System.out.println("Введите название курса студента");
        String courseName = scanner.nextLine();
        System.out.println("Введите возраст студента");
        int age = scanner.nextInt();

        Student student = new Student(name, courseName, age);
        Student savedStudent = studentRepository.save(student);
        System.out.println("Студент сохранен с id " + savedStudent.getId());

        Optional<Student> optionalStudent = studentRepository.findById(3L);
        if(optionalStudent.isEmpty()) {
            System.out.println("Студент не найден");
        } else {
            Student student1 = optionalStudent.get();
            System.out.println("Студент найден, имя: " + student1.getName());
        }
    }
}