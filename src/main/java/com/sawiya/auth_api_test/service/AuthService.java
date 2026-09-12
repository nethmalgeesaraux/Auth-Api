package com.sawiya.auth_api_test.service;

import com.sawiya.auth_api_test.dto.AuthResponse;
import com.sawiya.auth_api_test.dto.SignInRequest;

public interface AuthService {

    AuthResponse signIn(SignInRequest request);

}