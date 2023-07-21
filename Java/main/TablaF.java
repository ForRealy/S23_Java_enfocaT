package com.main;
public class TablaF {

    public static void main(String args[]) {
        // Datos de la tabla
        String nombre = "Nombre";
        String apellidos = "Apellidos";
        String curso = "Curso";
        int año = 2023;

        // Tabla con formato de espacios
        System.out.println("Tabla con formato de espacios:");
        System.out.printf("%-10s %-10s%n", "Nombre:", nombre);
        System.out.printf("%-10s %-10s%n", "Apellidos:", apellidos);
        System.out.printf("%-10s %-10s%n", "Curso:", curso);
        System.out.printf("%-10s %-10d%n", "Año:", año);

        // Tabla con formato de guiones
        System.out.println("\nTabla con formato de guiones:");
        System.out.printf("%-10s%n", "Nombre:");
        System.out.printf("%s%n", "----------");
        System.out.printf("%-10s%n", nombre);
        System.out.printf("%n%-10s%n", "Apellidos:");
        System.out.printf("%s%n", "----------");
        System.out.printf("%-10s%n", apellidos);
        System.out.printf("%n%-10s%n", "Curso:");
        System.out.printf("%s%n", "----------");
        System.out.printf("%-10s%n", curso);
        System.out.printf("%n%-10s%n", "Año:");
        System.out.printf("%s%n", "----------");
        System.out.printf("%-10d%n", año);
    }
}
