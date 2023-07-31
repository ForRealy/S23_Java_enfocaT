package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Ejercicio5 {

    private final UserRepository userRepository;

    public Ejercicio5(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<String> getUsers() throws JsonProcessingException {
        Iterable<org.apache.catalina.User> users = userRepository.findAll();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(users);
        return ResponseEntity.ok(json);
    }
}
