package com.main;
import java.util.Scanner;

public class ScannerDemo {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Introduce un entero: ");
		int entero = scanner.nextInt();

		System.out.print("Introduce un double: ");
		double doubleo = scanner.nextDouble();

		System.out.print("Introduce un String: ");
		String texto = scanner.next();

		System.out.print("Introduce un booleano (true/false): ");
		boolean booleano = scanner.nextBoolean();

		System.out.println("Has introducido:");
		System.out.println("* Entero: " + entero);
		System.out.println("* Double: " + doubleo);
		System.out.println("* String: " + texto);
		System.out.println("* Booleano: " + booleano);
	}
  }
}
