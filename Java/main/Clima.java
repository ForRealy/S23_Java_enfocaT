package com.main;
public class Clima {
    public static void main(String args[]) {
        // Definir temperatura
        double temperatura = 25.5;

        // Utilizando if sin else
        if (temperatura < 0) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Muy frio");
        }
        if (temperatura >= 0 && temperatura < 10) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Frio");
        }
        if (temperatura >= 10 && temperatura < 20) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Templado");
        }
        if (temperatura >= 20 && temperatura < 30) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Calido");
        }
        if (temperatura >= 30) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Muy calido");
        }

        // Utilizando if-elseif-else
        if (temperatura < 0) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Muy frio");
        } else if (temperatura < 10) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Frio");
        } else if (temperatura < 20) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Templado");
        } else if (temperatura < 30) {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Calido");
        } else {
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Categoria: Muy calido");
        }
    }
}
