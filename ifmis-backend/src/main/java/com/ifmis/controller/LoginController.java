package com.ifmis.controller;

import com.ifmis.dto.LoginRequest;
import com.ifmis.dto.LoginResponse;
import com.ifmis.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        return loginService.authenticate(request);
    }
}