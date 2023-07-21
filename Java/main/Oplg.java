package com.main;
public class Oplg {
    public static void main(String args[]) {
        int numero = 7;
        String resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println(resultado);
        
        boolean esBlanco = Math.random() < 0.5;
        String color = esBlanco ? "blanco" : "negro";
        System.out.println(color);
    }
}
