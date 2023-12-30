package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserDTO {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JoinRequestDTO {
        private String username;
        private String password;
        private String email;
    }
}
