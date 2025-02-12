package com.example.schedule.dto;

import lombok.Getter;

@Getter
public class ScheduleWithEmailResponseDto {

    private final String title;
    private final String content;
    private final String email;

    public ScheduleWithEmailResponseDto(String title, String content, String email) {
        this.title = title;
        this.content = content;
        this.email = email;
    }
}
