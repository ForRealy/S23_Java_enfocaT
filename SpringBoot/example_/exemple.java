package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exemple {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello")
    public String helloPost() {
        return "Hello World! (POST)";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name) {
        return "Hello " + name + "!";
    }
}