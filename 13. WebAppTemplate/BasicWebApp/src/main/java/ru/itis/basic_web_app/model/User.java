package ru.itis.basic_web_app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class User {
    private Long id;
    private String username;
    private String email;
    private String courseName;
    private String passwordHash;
}
