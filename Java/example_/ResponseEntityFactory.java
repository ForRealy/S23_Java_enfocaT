package com.example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityFactory {

    public static ResponseEntity<Object> created(Object body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }
}