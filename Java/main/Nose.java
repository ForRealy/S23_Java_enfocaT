package com.main;

public class Nose {

    public static void main(String args[]) {

        // Recorrer el siguiente array de forma recursiva
        String[] tecnologias = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
        recorrerArrayRecursivo(tecnologias, 0);

        // Recorrer el array anterior hasta llegar a "HTML"
        recorrerArrayRecursivoHastaHTML(tecnologias, 0, "HTML");

        // Fibonacci de forma recursiva hasta que un número pasado por parámetro dentro de la función recursiva supere el siguiente número recursivo
        long n = 10;
        System.out.println("Serie fibonacci:");
        for (long i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Invierte la palabra supercalifragilisticoespialidoso mediante una función recursiva
        System.out.println("\nPalabra original: supercalifragilisticoespialidoso");
        System.out.println("Palabra invertida: " + invertirPalabra("supercalifragilisticoespialidoso"));

        // Suma los números de un número pasado por parámetro de forma recursiva
        int n2 = 10;
        System.out.println("Suma de los números de 1 a " + n2 + ": " + sumarNumeros(n2));
    }

    public static void recorrerArrayRecursivo(String[] tecnologias, int index) {
        if (index >= tecnologias.length) {
            return;
        }

        System.out.println(tecnologias[index]);
        recorrerArrayRecursivo(tecnologias, index + 1);
    }

    public static void recorrerArrayRecursivoHastaHTML(String[] tecnologias, int index, String target) {
        if (index >= tecnologias.length) {
            return;
        }

        if (tecnologias[index].equals(target)) {
            System.out.println("Encontrado HTML!");
            return;
        }

        recorrerArrayRecursivoHastaHTML(tecnologias, index + 1, target);
    }

    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static String invertirPalabra(String palabra) {
        if (palabra.length() <= 1) {
            return palabra;
        }

        return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
    }

    public static int sumarNumeros(int n) {
        if (n <= 1) {
            return n;
        }

        return n + sumarNumeros(n - 1);
    }
}
