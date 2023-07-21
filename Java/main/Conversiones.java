package com.main;
public class Conversiones {

    public static void main(String args[]) {
        // Escalera de conversiones de double a byte
        double numeroDouble = 123.456;
        float numeroFloat = (float) numeroDouble;
        long numeroLong = (long) numeroFloat;
        int numeroInt = (int) numeroLong;
        short numeroShort = (short) numeroInt;
        byte numeroByte = (byte) numeroShort;

        System.out.println("Numero original: " + numeroDouble);
        System.out.println("Numero convertido a byte: " + numeroByte);

        // Conversiones ascendentes de byte a double
        byte numeroByte2 = 10;
        short numeroShort2 = numeroByte2;
        int numeroInt2 = numeroShort2;
        long numeroLong2 = numeroInt2;
        float numeroFloat2 = numeroLong2;
        double numeroDouble2 = numeroFloat2;

        System.out.println("Numero original: " + numeroByte2);
        System.out.println("Numero convertido a double: " + numeroDouble2);

        // Multiplicación de byte y desbordamiento
        byte numeroByte3 = 100;
        int resultado = numeroByte3 * 2;
        byte nuevoNumeroByte = (byte) resultado;

        System.out.println("Numero original: " + numeroByte3);
        System.out.println("Resultado de la multiplicacion: " + resultado);
        System.out.println("Nuevo numero byte: " + nuevoNumeroByte);
    }
}
