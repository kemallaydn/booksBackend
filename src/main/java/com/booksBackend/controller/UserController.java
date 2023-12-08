package com.booksBackend.controller;

import com.booksBackend.entity.User;
import com.booksBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveOrder")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

}
