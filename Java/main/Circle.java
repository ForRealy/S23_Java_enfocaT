package com.main;
public class Circle {
    public static void main(String args[]) {
        // Rango circular para byte
        byte byteNumber = 120; // Valor inicial
        System.out.println("Byte: " + byteNumber);
        for (int i = 1; i <= 5; i++) {
            byteNumber++; // Incremento en 1
            System.out.println("Byte: " + byteNumber);
        }
        
        // Rango circular para short
        short shortNumber = 32000; // Valor inicial
        System.out.println("Short: " + shortNumber);
        for (int i = 1; i <= 25; i++) {
            shortNumber++; // Incremento en 1
            System.out.println("Short: " + shortNumber);
        }
        
        // Rango circular para int
        int intNumber = 200000; // Valor inicial
        System.out.println("Int: " + intNumber);
        for (int i = 1; i <= 10000; i++) {
            intNumber++; // Incremento en 1
            System.out.println("Int: " + intNumber);
        }
        
        // Rango circular para long
        long longNumber = 9000000000L; // Valor inicial
        System.out.println("Long: " + longNumber);
        for (int i = 1; i <= 20000; i++) {
            longNumber++; // Incremento en 1
            System.out.println("Long: " + longNumber);
        }
    }
}
