package com.sawiya.auth_api_test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {

    private String message;
    private Long userId;
    private String name;
    private String email;
    private LocalDateTime createdAt;

}
