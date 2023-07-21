package com.main;

import java.util.Locale;
import java.util.Scanner;

public class useLocale {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
		try {
		  System.out.print("Ingresa un entero: ");
		  int entero = scanner.nextInt();

		  System.out.print("Ingresa un double: ");
		  double doubleo = scanner.nextDouble();

		  System.out.print("Ingresa un String: ");
		  String texto = scanner.next();

		  System.out.print("Ingresa un booleano (true/false): ");
		  boolean booleano = scanner.nextBoolean();

		  System.out.println("Has introducido:");
		  System.out.println("* Entero: " + entero);
		  System.out.println("* Double: " + doubleo);
		  System.out.println("* String: " + texto);
		  System.out.println("* Booleano: " + booleano);
		} catch (ArrayIndexOutOfBoundsException e) {
		  System.err.println("Error: el arreglo está fuera de límites");
		} catch (ArithmeticException e) {
		  System.err.println("Error: ocurrió una excepción aritmética");
		}

		scanner.useLocale(new Locale("es", "MX"));

		System.out.print("Ingresa un número real (con decimales): ");
		double numeroReal = scanner.nextDouble();

		System.out.println("Has introducido: " + numeroReal);
	}
  }
}
