package com.example.server.auth.service;

import org.springframework.stereotype.Service;

import com.example.server.auth.domain.User;
import com.example.server.auth.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
