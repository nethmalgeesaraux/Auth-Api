package com.sawiya.auth_api_test.service;

import com.sawiya.auth_api_test.dto.AuthResponse;
import com.sawiya.auth_api_test.dto.SignInRequest;
import com.sawiya.auth_api_test.dto.SignUpRequest;

public interface AuthService {

    AuthResponse signUp(SignUpRequest request);

    AuthResponse signIn(SignInRequest request);
}
