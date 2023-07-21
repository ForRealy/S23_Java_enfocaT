package com.main;
public class Tabla {
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\033[38;2;255;204;0m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String args[]) {
        System.out.println(BOLD + "Tipo de Datos" + RESET);
        System.out.println();
        System.out.println(CYAN + "Tipo: byte" + RESET);
        System.out.println("Este formado por: 1 Byte");
        System.out.println("Un byte este formado por: 8 Bits");
        System.out.println("Su Rango va del: -128 a 127");
        System.out.println();

        System.out.println(BOLD + "Resumen" + RESET);
        System.out.println();
        System.out.println(GREEN + "Rango byte desde: -128 hasta: 127" + RESET);
        System.out.println(YELLOW + "Rango short desde: -32768 hasta: 32767" + RESET);
        System.out.println(BLUE + "Rango int desde: -2147483648 hasta: 2147483647" + RESET);
        System.out.println(CYAN + "Rango long desde: -9223372036854775808 hasta: 9223372036854775807" + RESET);
        System.out.println(GREEN + "Rango float desde: 1.4E-45 hasta: 3.4028235E38" + RESET);
        System.out.println(YELLOW + "Rango double desde: 4.9E-324 hasta: 1.7976931348623157E308" + RESET);
    }
}
