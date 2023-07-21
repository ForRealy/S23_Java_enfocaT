package com.main;
public class Datos {
    public static void main(String args[]) {

        // Obtener la clase a la que pertenecen
        Class<? extends Long> longClass = Long.class;
        Class<? extends Byte> byteClass = Byte.class;
        Class<? extends Short> shortClass = Short.class;
        Class<? extends Integer> integerClass = Integer.class;

        System.out.println(longClass);    // class java.lang.Long
        System.out.println(byteClass);    // class java.lang.Byte
        System.out.println(shortClass);   // class java.lang.Short
        System.out.println(integerClass); // class java.lang.Integer

        // Ejemplo de casting para obtener la clase
        byte byteValue = 10;
        Class<? extends Byte> byteClassCasting = ((Byte) byteValue).getClass();
        System.out.println(byteClassCasting); // class java.lang.Byte

        // Ejemplo utilizando métodos estáticos de los tipos envoltorios
        byte byteValueStatic = 10;
        Class<? extends Byte> byteClassStatic = Byte.valueOf(byteValueStatic).getClass();
        System.out.println(byteClassStatic); // class java.lang.Byte

        // Ejemplo obteniendo el nombre de la clase como cadena
        byte byteValueGetName = 10;
        String byteClassName = Byte.valueOf(byteValueGetName).getClass().getName();
        System.out.println(byteClassName); // java.lang.Byte
    }
}
