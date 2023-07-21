package com.main;
public class Type {
    
    // Tipos primitivos lógicos
    boolean flag = true; // Ejemplo de tipo lógico (verdadero o falso)
    
    // Tipos primitivos de caracteres
    char letter = 'A'; // Ejemplo de tipo carácter
    
    // Tipos primitivos numéricos enteros
    byte b = 10; // Ejemplo de tipo byte
    short s = 100; // Ejemplo de tipo short
    int i = 1000; // Ejemplo de tipo int
    long l = 10000L; // Ejemplo de tipo long
    
    // Tipos primitivos numéricos reales
    float f = 3.14f; // Ejemplo de tipo float
    double d = 3.14159; // Ejemplo de tipo double
    
    public static void main(String args[]) {
        // Imprimir los valores de los tipos primitivos
        Type obj = new Type();
        System.out.println(obj.flag); // Imprime el valor de flag
        System.out.println(obj.letter); // Imprime el valor de letter
        System.out.println(obj.b); // Imprime el valor de b
        System.out.println(obj.s); // Imprime el valor de s
        System.out.println(obj.i); // Imprime el valor de i
        System.out.println(obj.l); // Imprime el valor de l
        System.out.println(obj.f); // Imprime el valor de f
        System.out.println(obj.d); // Imprime el valor de d
    }
}
