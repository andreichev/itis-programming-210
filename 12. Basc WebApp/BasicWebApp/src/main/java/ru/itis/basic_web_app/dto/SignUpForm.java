package ru.itis.basic_web_app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class SignUpForm {
    private String username;
    private String email;
    private String courseName;
    private String password;
}
