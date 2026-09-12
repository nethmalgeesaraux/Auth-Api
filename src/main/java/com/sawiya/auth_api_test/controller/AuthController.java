package com.sawiya.auth_api_test.controller;

import com.sawiya.auth_api_test.dto.AuthResponse;
import com.sawiya.auth_api_test.dto.SignInRequest;
import com.sawiya.auth_api_test.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signin")
    public ResponseEntity<AuthResponse> signIn(@Valid @RequestBody SignInRequest request) {

        AuthResponse response = authService.signIn(request);
        return ResponseEntity.ok(response);
    }
}
