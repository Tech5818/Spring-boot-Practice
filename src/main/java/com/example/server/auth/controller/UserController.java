package com.example.server.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.auth.domain.User;
import com.example.server.auth.repository.UserRepository;
import com.example.server.dto.UserDTO;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("/user/join")
    public ResponseEntity<Object> joinUser(@RequestBody UserDTO.JoinRequestDTO joinRequestDTO) {
        User newUser = User.builder()
                    .username(joinRequestDTO.getUsername())
                    .password(joinRequestDTO.getPassword())
                    .email(joinRequestDTO.getEmail())
                    .build();
        
        userRepository.save(newUser);

        return ResponseEntity.ok().build();
    }
    
}
