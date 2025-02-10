package com.example.schedule.dto;

import lombok.Getter;

@Getter
public class CreatedScheduleRequestDto {

    private final String title;
    private final String content;
    private final String username;

    public CreatedScheduleRequestDto(String title, String content, String username) {
        this.title = title;
        this.content = content;
        this.username = username;
    }
}

