package com.main;

public class Federico {

  public static void main(String[] args) {
    if (args.length == 2 && args[0].equals("Federico") && args[1].equals("GarcíaLorca")) {
      Lorcadass lorca = new Lorcadass();
      lorca.recitarPoema();
    } else {
      System.out.printf("Los parametros introducidos no son los esperados. Los parametros esperados son: %s %s.\n", "Federico", "Garcia Lorca");
    }
  }
}

class Lorcadass {

  public void recitarPoema() {
    System.out.println("¡Ay, Carmela! ¡Ay, Carmela!");
    System.out.println("¡Ay, pena, ay dolor!");
    System.out.println("Que me muero de amores");
    System.out.println("Por la linda Carmela.");
    System.out.println("¡Ay, Carmela! ¡Ay, Carmela!");
    System.out.println("¡Ay, pena, ay dolor!");
    System.out.println("Que me muero de amores");
    System.out.println("Por la linda Carmela.");
  }
}

class NotAutorized {

  public void printMessage() {
    System.out.println("Los parámetros introducidos no son los esperados.");
  }
}
