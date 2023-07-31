package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiVersion")
public class Ejercicio8 {

    @GetMapping("/hacercafe")
    @ResponseStatus(HttpStatus.OK)
    public String hacerCafe() {
        return "El café está hecho!";
    }

    @GetMapping("/hacerte")
    @ResponseStatus(HttpStatus.OK)
    public String hacerte() {
        return "Soy una tetera!";
    }

    @GetMapping("/notfound")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound() {
        return "Not found";
    }
}
