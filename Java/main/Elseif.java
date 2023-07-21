package com.main;
public class Elseif {
    public static void main(String args[]) {
        double number = 55;
        String mensaje = (number > 0) ? "Es positivo" : (number < 0) ? "Es negativo" : "Es cero";
        System.out.println(mensaje);
    }
}
