package com.main;
public class Arbolp {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLACK = "\u001B[30m";
    
    public boolean print() {
        System.out.println("Soy un arbol");
		return false;
    }
    public static void main(String args[]) {
        int altura = 8; // Altura del árbol
        
        // Bucle para imprimir las líneas del árbol
        for (int i = 0; i < altura; i++) {
            // Espacios en blanco antes de los asteriscos
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            
            // Asteriscos
            for (int k = 1; k < 2 * i + 1; k++) {
                System.out.print(GREEN + "*" + RESET);
            }
            
            System.out.println(); // Salto de línea
        }
        
        // Tronco del árbol
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < altura - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(BLACK + "****" + RESET);
        }
    }
}
