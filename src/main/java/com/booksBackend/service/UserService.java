package com.booksBackend.service;

import com.booksBackend.controller.UserController;
import com.booksBackend.dao.user.IUserDao;
import com.booksBackend.dao.user.UserDaoImpl;
import com.booksBackend.dao.userToken.IUserTokenDao;
import com.booksBackend.dao.userToken.UserTokenImpl;
import com.booksBackend.entity.User;
import com.booksBackend.entity.UserToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    private  UserService userService;

    private  final TokenService tokenService = new TokenService();
    public User addUser(User user) {
        IUserDao userDao = new UserDaoImpl();
        return userDao.save(user);
    }

    public User authenticateUser(String email, String password) {
        IUserDao userDao = new UserDaoImpl();
        User user = userDao.getUser(email);

        if (user == null || !user.getPassword().equals(password)) {
            return null;
        }
        return user;
    }
}
