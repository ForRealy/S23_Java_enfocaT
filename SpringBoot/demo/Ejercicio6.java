package com.example.demo;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random")
public class Ejercicio6 {

    @GetMapping
    public ResponseEntity<Integer> getRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(2);
        return ResponseEntity.status(number == 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND).body(number);
    }
}
