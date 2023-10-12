package ru.itis.java_lessons.model;

public class Student {
    private Long id;
    private String name;
    private String courseName;
    private int age;

    public Student(Long id, String name, String courseName, int age) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
        this.age = age;
    }

    public Student(String name, String courseName, int age) {
        this.id = null;
        this.name = name;
        this.courseName = courseName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
