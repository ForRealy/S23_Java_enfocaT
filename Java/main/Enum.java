package com.main;

public class Enum {

  public static void main(String[] args) {
    // Crea tres instancias de la clase Developer
    Developer developer1 = new Developer();
    Developer developer2 = new Developer();
    Developer developer3 = new Developer();

    // Asigna un rol distinto a cada uno de ellos
    developer1.setRolTecnologico(Profesiones.BACK_END_DEVELOPER);
    developer2.setRolTecnologico(Profesiones.FRONT_END_DEVELOPER);
    developer3.setRolTecnologico(Profesiones.FULL_STACK_DEVELOPER);

    // Comprueba los que son Back End Developers y/o Full Stack Developers y diles "Viva el Back"
    if (developer1.getRolTecnologico() == Profesiones.BACK_END_DEVELOPER || developer1.getRolTecnologico() == Profesiones.FULL_STACK_DEVELOPER) {
      System.out.println("Viva el Back End!");
    }

    if (developer2.getRolTecnologico() == Profesiones.BACK_END_DEVELOPER || developer2.getRolTecnologico() == Profesiones.FULL_STACK_DEVELOPER) {
      System.out.println("Viva el Back End!");
    }

    if (developer3.getRolTecnologico() == Profesiones.BACK_END_DEVELOPER || developer3.getRolTecnologico() == Profesiones.FULL_STACK_DEVELOPER) {
      System.out.println("Viva el Back End!");
    }

    // Comprueba los que no son Back End Developers e imprime "JS es una @ es mejor utilizar TypeScript"
    if (developer1.getRolTecnologico() != Profesiones.BACK_END_DEVELOPER) {
      System.out.println("JS es una @ es mejor utilizar TypeScript");
    }

    if (developer2.getRolTecnologico() != Profesiones.BACK_END_DEVELOPER) {
      System.out.println("JS es una @ es mejor utilizar TypeScript");
    }

    if (developer3.getRolTecnologico() != Profesiones.BACK_END_DEVELOPER) {
      System.out.println("JS es una @ es mejor utilizar TypeScript");
    }
  }
}
