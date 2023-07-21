package com.main;
public class Oprel {
    public static void main(String args[]) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 2;
        
        // Comprueba si el valor de num4 es igual al de num2
        boolean igual1 = num4 == num2;
        System.out.println("num4 es igual a num2: " + igual1);
        
        // Comprueba si el valor de num2 es igual al de num3
        boolean igual2 = num2 == num3;
        System.out.println("num2 es igual a num3: " + igual2);
        
        // Comprueba si el valor de num1 es distinto a num3
        boolean distinto1 = num1 != num3;
        System.out.println("num1 es distinto a num3: " + distinto1);
        
        // Comprueba si el valor de num2 es distinto a num2
        boolean distinto2 = num1!= num2;
        System.out.println("num2 es distinto a num2: " + distinto2);
        
        // Comprueba si el valor de num4 es menor que num2
        boolean menor1 = num4 < num2;
        System.out.println("num4 es menor que num2: " + menor1);
        
        // Comprueba si el valor de num3 es menor que num1
        boolean menor2 = num3 < num1;
        System.out.println("num3 es menor que num1: " + menor2);
        
        // Comprueba si el valor de num1 es mayor que num2
        boolean mayor1 = num1 > num2;
        System.out.println("num1 es mayor que num2: " + mayor1);
        
        // Comprueba si el valor de num2 es mayor que num4
        boolean mayor2 = num2 > num4;
        System.out.println("num2 es mayor que num4: " + mayor2);
        
        // Comprueba si el valor de num2 es mayor que num3
        boolean mayor3 = num2 > num3;
        System.out.println("num2 es mayor que num3: " + mayor3);
        
        // Comprueba si el valor de num2 es igual o menor que num3
        boolean igualOmenor1 = num2 <= num3;
        System.out.println("num2 es igual o menor que num3: " + igualOmenor1);
        
        // Comprueba si el valor de num2 es igual o menor que num4
        boolean igualOmenor2 = num2 <= num4;
        System.out.println("num2 es igual o menor que num4: " + igualOmenor2);
        
        // Comprueba si el valor de num2 es igual o menor que num1
        boolean igualOmenor3 = num2 <= num1;
        System.out.println("num2 es igual o menor que num1: " + igualOmenor3);
        
        // Comprueba si el valor de num1 es mayor o igual que num2
        boolean mayorOigual1 = num1 >= num2;
        System.out.println("num1 es mayor o igual que num2: " + mayorOigual1);
        
        // Comprueba si el valor de num2 es mayor o igual que num3
        boolean mayorOigual2 = num2 >= num3;
        System.out.println("num2 es mayor o igual que num3: " + mayorOigual2);
        
        // Comprueba si el valor de num2 es igual o mayor que num1
        boolean igualOimayor = num2 >= num1;
        System.out.println("num2 es igual o mayor que num1: " + igualOimayor);
    }
}
