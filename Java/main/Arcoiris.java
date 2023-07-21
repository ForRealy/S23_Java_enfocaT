package com.main;
import java.util.Random;

public class Arcoiris {
    public static void main(String args[]) {
        String[] colores = {
            "\u001B[31m", // Rojo
            "\u001B[32m", // Verde
            "\u001B[33m", // Amarillo
            "\u001B[34m", // Azul
            "\u001B[35m", // Magenta
            "\u001B[36m", // Cyan
            "\u001B[37m"  // Blanco
        };

        String[] fondos = {
            "\u001B[40m", // Negro
            "\u001B[41m", // Rojo
            "\u001B[42m", // Verde
            "\u001B[43m", // Amarillo
            "\u001B[44m", // Azul
            "\u001B[45m", // Magenta
            "\u001B[46m", // Cyan
            "\u001B[47m"  // Blanco
        };

        String[] formatos = {
            "\u001B[0m",    // Formato normal
            "\u001B[1m",    // Negrita
            "\u001B[2m",    // Opaco
            "\u001B[3m",    // Cursiva
            "\u001B[4m",    // Subrayado
            "\u001B[5m",    // Parpadeo
            "\u001B[7m"     // Invertido
        };

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String color = colores[random.nextInt(colores.length)];
            String fondo = fondos[random.nextInt(fondos.length)];
            String formato = formatos[random.nextInt(formatos.length)];

            String texto = "***********************";

            System.out.println(color + fondo + formato + texto + "\u001B[0m");
        }
    }
}
