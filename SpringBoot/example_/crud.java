package com.example;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserRepository;

@RestController
public class crud {

    private static final Logger LOGGER = Logger.getLogger(crud.class.getName());

    private final UserRepository userRepository;

    public crud(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public com.login.controllers.List<User> getAllUsers() {
        LOGGER.info("Get all users");
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        LOGGER.info("Create user: " + user);
        return userRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        LOGGER.info("Update user by id: " + id);
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable Long id) {
        LOGGER.info("Delete user by id: " + id);
        userRepository.deleteById(id);
    }
}
