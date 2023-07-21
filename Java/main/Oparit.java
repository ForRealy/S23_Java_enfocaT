package com.main;
public class Oparit {
    private static int numero = 0;
    
    public static void main(String args[]) {
        incrementar();
        System.out.println("Valor actual: " + numero);
        
        decrementar();
        System.out.println("Valor actual: " + numero);
    }
    
    public static void incrementar() {
        numero++;
    }
    
    public static void decrementar() {
        numero -= 2;
    }
}
