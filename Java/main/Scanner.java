package com.main;

public class Scanner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner();

    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextLine();

    System.out.print("Ingresa tu primer apellido: ");
    String apellido1 = scanner.nextLine();

    System.out.print("Ingresa tu segundo apellido: ");
    String apellido2 = scanner.nextLine();

    System.out.println("Tu nombre es " + nombre + " " + apellido1 + " " + apellido2);
  }

private String nextLine() {
	return null;
}
}
