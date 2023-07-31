package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ejercicio1 {

    private static final Logger logger = LoggerFactory.getLogger(Ejercicio1.class);

    public static void main(String[] args) {
        logger.trace("This is a trace message.");
        logger.debug("This is a debug message.");
        logger.info("This is an info message.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
    }
}
