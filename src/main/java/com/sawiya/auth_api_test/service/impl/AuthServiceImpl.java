package com.sawiya.auth_api_test.service.impl;

import com.sawiya.auth_api_test.dto.AuthResponse;
import com.sawiya.auth_api_test.dto.SignInRequest;
import com.sawiya.auth_api_test.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {


    @Override
    public AuthResponse signIn(SignInRequest request) {
        return null;
    }
}
