package com.main;
public class Const {
    public static void main(String args[]) {
        // Rango circular para byte
        final byte BYTE_NUMBER = 120; // Valor inicial
        System.out.println("Byte: " + BYTE_NUMBER);
        for (int i = 1; i <= 5; i++) {
            // Incremento en 1
            final byte byteResult = (byte) (BYTE_NUMBER + i);
            System.out.println("Byte: " + byteResult);
        }

        // Rango circular para short
        final short SHORT_NUMBER = 32000; // Valor inicial
        System.out.println("Short: " + SHORT_NUMBER);
        for (int i = 1; i <= 25; i++) {
            // Incremento en 1
            final short shortResult = (short) (SHORT_NUMBER + i);
            System.out.println("Short: " + shortResult);
        }

        // Rango circular para int
        final int INT_NUMBER = 200000; // Valor inicial
        System.out.println("Int: " + INT_NUMBER);
        for (int i = 1; i <= 10000; i++) {
            // Incremento en 1
            final int intResult = INT_NUMBER + i;
            System.out.println("Int: " + intResult);
        }

        // Rango circular para long
        final long LONG_NUMBER = 9000000000L; // Valor inicial
        System.out.println("Long: " + LONG_NUMBER);
        for (int i = 1; i <= 20000; i++) {
            // Incremento en 1
            final long longResult = LONG_NUMBER + i;
            System.out.println("Long: " + longResult);
        }
    }
}
