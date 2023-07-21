package com.main;

import javax.swing.*;

public class ShowImput {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola, " + input + "!");
    }
}
