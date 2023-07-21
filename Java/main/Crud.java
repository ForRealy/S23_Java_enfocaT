package com.main;

import java.util.Scanner;

public class Crud {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Que quieres hacer?");
		System.out.println("1. Crear");
		System.out.println("2. Leer");
		System.out.println("3. Actualizar");
		System.out.println("4. Eliminar");

		int option = scanner.nextInt();

		switch (option) {
		  case 1:
		    System.out.println("Crear");
		    break;
		  case 2:
		    System.out.println("Leer");
		    break;
		  case 3:
		    System.out.println("Actualizar");
		    break;
		  case 4:
		    System.out.println("Eliminar");
		    break;
		  default:
		    System.out.println("Opción no válida");
		    break;
		}
	}
  }
}