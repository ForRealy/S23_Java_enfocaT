package com.example.demo;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random")
public class Ejercicio7 {

    @GetMapping
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Integer> getRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(2);
        return number == 0 ? ResponseEntity.ok(number) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(number);
    }
}
