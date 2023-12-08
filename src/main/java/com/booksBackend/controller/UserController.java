package com.booksBackend.controller;

import com.booksBackend.entity.User;
import com.booksBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService = new UserService();
    @PostMapping("/saveOrder")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

}
