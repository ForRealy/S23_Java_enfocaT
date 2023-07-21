package com.main;
public class Formatos {

    public static void main(String args[]) {
        // Ejercicio 1
        System.out.printf("%s%n%s%n%s%n", "NOMBRE", "APELLIDO", "APELLIDO2");

        // Ejercicio 2
        System.out.printf("%-10s %-10s %-10s%n", "NOMBRE", "apellido", "apellido2");

        // Ejercicio 3
        System.out.printf("%10s, %10s, %s%n", "apellido2", "apellidol", "Nombre");

        // Ejercicio 4
        System.out.printf("%n22%n");

        // Ejercicio 5
        System.out.printf("%010d%n", 22);

        // Ejercicio 6
        System.out.printf("%010.2f%n", 17.1829327);

        // Ejercicio 7
        System.out.printf("%s%n%s%n", "-bla", "Mido");
    }
}
