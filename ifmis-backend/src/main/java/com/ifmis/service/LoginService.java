package com.ifmis.service;

import com.ifmis.dto.LoginRequest;
import com.ifmis.dto.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginResponse authenticate(LoginRequest request) {

        if ("admin".equals(request.getUsername())
                && "admin123".equals(request.getPassword())) {

            return new LoginResponse(
                    true,
                    "Login Successful",
                    "mock-token-123456"
            );
        }

        return new LoginResponse(
                false,
                "Invalid Username or Password",
                null
        );
    }
}