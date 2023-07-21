package com.main;
public class Banderas {
    // Constantes de colores
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[41m";
    public static final String YELLOW = "\033[48;2;255;204;0m";
    public static final String BLUE = "\u001B[44m";
    public static final String WHITE = "\u001B[47m";
    public static final String BLACK = "\u001B[40m";

    // Constantes de estilos de texto
    public static final String UNDERLINE = "\u001B[4m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String args[]) {
        // Dibujar las banderas
        System.out.println("\nUcrania:");
        dibujarBandera(Ucrania());

        System.out.println("\nGrecia:");
        dibujarBandera(Grecia());

        System.out.println("\nFrancia:");
        dibujarBandera(Francia());

        System.out.println("\nEspaña:");
        dibujarBandera(España());

        System.out.println("\nCatalunya:");
        dibujarBandera(Cataluña());

        System.out.println("\nAlemania:");
        dibujarBandera(Alemania());
    }

    // Función para dibujar una bandera
    public static void dibujarBandera(String[] bandera) {
        for (String linea : bandera) {
            System.out.println(linea);
        }
    }

    // Función para transformar un texto con formato
    public static String transformarTexto(String texto, String background, String color, String tipoTexto) {
        return background + color + tipoTexto + texto + RESET;
    }

    // Banderas
    public static String[] Ucrania() {
        String[] bandera = {
            transformarTexto("***********************", YELLOW, YELLOW, BOLD),
            transformarTexto("***********************", YELLOW, YELLOW, BOLD),
            transformarTexto("***********************", YELLOW, YELLOW, BOLD),
            transformarTexto("***********************", BLUE, BLUE, BOLD),
            transformarTexto("***********************", BLUE, BLUE, BOLD),
            transformarTexto("***********************", BLUE, BLUE, BOLD)
        };
        return bandera;
    }

    public static String[] Grecia() {
        String[] bandera = {
            transformarTexto("***********************", BLUE, BLUE, BOLD),
            transformarTexto("***********************", WHITE, WHITE, BOLD),
            transformarTexto("***********************", BLUE, BLUE, BOLD),
            transformarTexto("***********************", WHITE, WHITE, BOLD),
            transformarTexto("***********************", BLUE, BLUE, BOLD),
            transformarTexto("***********************", WHITE, WHITE, BOLD)
        };
        return bandera;
    }

    public static String[] Francia() {
        String[] bandera = {
            transformarTexto("***********************", BLUE, BLUE, BOLD),
            transformarTexto("***********************", BLUE, BLUE, BOLD),
            transformarTexto("***********************", WHITE, WHITE, BOLD),
            transformarTexto("***********************", WHITE, WHITE, BOLD),
            transformarTexto("***********************", RED, RED, BOLD),
            transformarTexto("***********************", RED, RED, BOLD)
        };
        return bandera;
    }

    public static String[] España() {
        String[] bandera = {
            transformarTexto("***********************", RED, RED, BOLD),
            transformarTexto("***********************", RED, RED, BOLD),
            transformarTexto("***********************", YELLOW, YELLOW, BOLD),
            transformarTexto("***********************", YELLOW, YELLOW, BOLD),
            transformarTexto("***********************", RED, RED, BOLD),
            transformarTexto("***********************", RED, RED, BOLD)
        };
        return bandera;
    }

    public static String[] Cataluña() {
        String[] bandera = {
        		transformarTexto("***********************", RED, RED, BOLD),
                transformarTexto("***********************", YELLOW, YELLOW, BOLD),
                transformarTexto("***********************", RED, RED, BOLD),
                transformarTexto("***********************", YELLOW, YELLOW, BOLD),
                transformarTexto("***********************", RED, RED, BOLD),
                transformarTexto("***********************", YELLOW, YELLOW, BOLD)
        };
        return bandera;
    }

    public static String[] Alemania() {
        String[] bandera = {
        		transformarTexto("***********************", BLACK, BLACK, BOLD),
                transformarTexto("***********************", BLACK, BLACK, BOLD),
                transformarTexto("***********************", YELLOW, YELLOW, BOLD),
                transformarTexto("***********************", YELLOW, YELLOW, BOLD),
                transformarTexto("***********************", RED, RED, BOLD),
                transformarTexto("***********************", RED, RED, BOLD)
        };
        return bandera;
    }

}
