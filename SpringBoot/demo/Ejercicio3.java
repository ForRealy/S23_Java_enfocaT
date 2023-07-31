package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio3 {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/custom")
    public String customMessage() {
        return "This is a custom message.";
    }
}
