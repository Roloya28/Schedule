package com.example.schedule.service;

import com.example.schedule.dto.SignupResponseDto;
import com.example.schedule.entity.User;
import com.example.schedule.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public SignupResponseDto signup(String username, String email,String password) {

        User user = new User(username, email, password);

        User savedUser = userRepository.save(user);

        return new SignupResponseDto(savedUser.getId(), savedUser.getUsername(), savedUser.getEmail());
    }
}
