package com.main;
public class Estcond {
    public static void main(String args[]) {
        // Generar número aleatorio (0 o 1)
        int numeroAleatorio = (int) (Math.random() * 2);

        // Utilizando if sin else
        if (numeroAleatorio == 0) {
            System.out.println("Valor booleano: false");
            System.out.println("Color: Rojo");
        }
        if (numeroAleatorio == 1) {
            System.out.println("Valor booleano: true");
            System.out.println("Color: Negro");
        }

        // Utilizando if-else
        if (numeroAleatorio == 0) {
            System.out.println("Valor booleano: false");
            System.out.println("Color: Rojo");
        } else {
            System.out.println("Valor booleano: true");
            System.out.println("Color: Negro");
        }

        // Utilizando operador ternario
        String valorBooleano = (numeroAleatorio == 0) ? "false" : "true";
        String color = (numeroAleatorio == 0) ? "Rojo" : "Negro";
        System.out.println("Valor booleano: " + valorBooleano);
        System.out.println("Color: " + color);
    }
}
