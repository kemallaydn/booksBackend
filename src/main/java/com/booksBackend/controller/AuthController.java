package com.booksBackend.controller;
import com.booksBackend.dto.LoginForm;
import com.booksBackend.dto.LoginResponse;
import com.booksBackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginForm loginForm) {
       return authService.login(loginForm.getEmail(),loginForm.getPassword());
    }
}

