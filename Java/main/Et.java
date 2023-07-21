package com.main;
public class Et {
    public static void main(String args[]) {
        // Ejercicio 1: Números divisibles por 2
        System.out.println("Numeros divisibles por 2:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        // Ejercicio 2: Números del array divisibles por 3
        int[] numeros = {12, 5, 9, 18, 15, 7, 21};
        System.out.println("Numeros del array divisibles por 3:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
        
        // Ejercicio 3: Saludar un número determinado de veces
        int vecesSaludo = 5;
        System.out.println("Saludando " + vecesSaludo + " veces:");
        for (int i = 0; i < vecesSaludo; i++) {
            System.out.println("Hola");
        }
        
        // Ejercicio 4: Eliminar letras del abecedario
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasEliminadas = "";
        System.out.println("Eliminando letras del abecedario:");
        for (int i = abecedario.length() - 1; i > 0; i--) {
            String letra = abecedario.substring(i);
            letrasEliminadas = letra + letrasEliminadas;
            System.out.println(letrasEliminadas);
        }
    }
}
