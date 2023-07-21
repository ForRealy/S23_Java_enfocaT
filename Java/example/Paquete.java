package com.example;

// Importamos la clase Arbol de com.main
import com.main.Arbol;
// Importamos la clase Arbolp de com.main
import com.main.Arbolp;

public class Paquete {

    public static void main(String[] args) {
    	
    	// Creamos un objeto de la clase Arbol
        Arbol arbol = new Arbol();

        // Imprimimos el Arbol
        System.out.println(arbol.print());

        // Creamos un objeto de la clase Arbolp
        Arbolp arbolp = new Arbolp();

        // Imprimimos el Arbolp
        System.out.println(arbolp.print());
    }
}
