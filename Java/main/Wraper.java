package com.main;
public class Wraper {
    public static void main(String args[]) {
        identifyWrapper(Integer.class); // Integer
        identifyWrapper(Float.TYPE); // Float
        identifyWrapper(Character.TYPE); // Character
        identifyWrapper(String.class); // No es un tipo primitivo o Wrapper conocido
    }

    public static void identifyWrapper(Class<?> dataType) {
        if (dataType == Boolean.TYPE || dataType == Boolean.class) {
            System.out.println("Boolean");
        } else if (dataType == Byte.TYPE || dataType == Byte.class) {
            System.out.println("Byte");
        } else if (dataType == Short.TYPE || dataType == Short.class) {
            System.out.println("Short");
        } else if (dataType == Integer.TYPE || dataType == Integer.class) {
            System.out.println("Integer");
        } else if (dataType == Long.TYPE || dataType == Long.class) {
            System.out.println("Long");
        } else if (dataType == Float.TYPE || dataType == Float.class) {
            System.out.println("Float");
        } else if (dataType == Double.TYPE || dataType == Double.class) {
            System.out.println("Double");
        } else if (dataType == Character.TYPE || dataType == Character.class) {
            System.out.println("Character");
        } else {
            System.out.println("No es un tipo primitivo o Wrapper conocido");
        }
    }
}
