package com.main;
import java.util.Random;

public class Fun {
    public static void main(String args[]) {
        // Ejercicio 1:
        System.out.println("Ejercicio 1 - javaOrNul0:");
        System.out.println(javaOrNul0("java"));
        System.out.println(javaOrNul0("python"));
        
        // Ejercicio 2:
        System.out.println("\nEjercicio 2 - login:");
        System.out.println(login("admin", "1234"));
        System.out.println(login("admin", "1234a"));
        System.out.println(login("user", "1234"));
        
        // Ejercicio 3:
        System.out.println("\nEjercicio 3 - isEven:");
        System.out.println(isEven(10));
        System.out.println(isEven(7));
    }
    
    // Ejercicio 1:
    public static String javaOrNul0(String text) {
        if (text.equals("java")) {
            return "java";
        } else {
            return null;
        }
    }
    
    // Ejercicio 2: login
    public static String login(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            return "Login true";
        } else {
            return "Login false";
        }
    }
    
    // Ejercicio 3: isEven
    public static boolean isEven(int number) {
        Random rand = new Random();
        boolean result = rand.nextBoolean();
        
        if (number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
}
