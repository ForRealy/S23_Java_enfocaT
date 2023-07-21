package com.main;
public class Salto {
    public static void main(String args[]) {
        // Ejercicio 1: Salir del bucle en la 3ª iteración
        System.out.println("Ejercicio 1 - Salir del bucle en la 3ª iteración:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
            if (i == 3) {
                break;
            }
        }
        
        // Ejercicio 2: Salir del bucle en la 5ª iteración sin imprimir el mensaje
        System.out.println("\nEjercicio 2 - Salir del bucle en la 5ª iteración sin imprimir el mensaje:");
        int i = 1;
        while (i <= 5) {
            if (i != 5) {
                System.out.println("Iteración " + i);
            }
            i++;
            if (i == 5) {
                continue;
            }
        }
    }
}
