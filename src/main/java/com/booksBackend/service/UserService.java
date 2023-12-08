package com.booksBackend.service;

import com.booksBackend.entity.User;
import com.booksBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User addUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
