package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Ejercicio4_1 {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio4_1.class, args);
    }

    @RestController
    public class MyController {

        @GetMapping("/")
        public String index() {
            return "index.html";
        }

        @GetMapping("/contact")
        public String contact() {
            return "contact.html";
        }

        @GetMapping("/about")
        public String about() {
            return "about.html";
        }
    }
}