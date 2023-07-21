package com.main;
public class Bool {
    public static void main(String args[]) {
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = false;
        boolean bool4 = true;
        
        // Compara si bool1 es igual al valor invertido de bool2
        boolean comp1 = bool1 == !bool2;
        System.out.println("bool1 es igual al valor invertido de bool2: " + comp1);
        
        // Compara si bool2 es igual al valor invertido de bool3
        boolean comp2 = bool2 == !bool3;
        System.out.println("bool2 es igual al valor invertido de bool3: " + comp2);
        
        // Compara si bool3 es igual al valor invertido de bool4
        boolean comp3 = bool3 == !bool4;
        System.out.println("bool3 es igual al valor invertido de bool4: " + comp3);
    }
}
