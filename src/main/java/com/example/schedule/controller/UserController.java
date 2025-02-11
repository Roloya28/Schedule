package com.example.schedule.controller;

import com.example.schedule.dto.SignupRequestDto;
import com.example.schedule.dto.SignupResponseDto;
import com.example.schedule.dto.UserResponseDto;
import com.example.schedule.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/schedules/signup") // 회원가입
    public ResponseEntity<SignupResponseDto> signup(@RequestBody SignupRequestDto requestDto) {

        SignupResponseDto signupResponseDto = userService.signup(requestDto.getUsername(), requestDto.getEmail(), requestDto.getPassword());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/schedules/{id}") // 아이디 찾기
    public ResponseEntity<UserResponseDto> findById(@PathVariable Long id) {

        UserResponseDto userResponseDto = userService.findById(id);

        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);
    }

}
