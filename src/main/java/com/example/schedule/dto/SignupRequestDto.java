package com.example.schedule.dto;

import lombok.Getter;

@Getter
public class SignupRequestDto {

    private final String username;
    private final String email;
    private final String password;

    public SignupRequestDto(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
