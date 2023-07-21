package com.main;

import javax.swing.*;

public class Dialog {

    public static void main(String[] args) {
        String input;
        do {
            input = JOptionPane.showInputDialog("Introduce tu nombre: ");
        } while (input == null || input.isEmpty());

        if (input.length() > 0) {
            JOptionPane.showMessageDialog(null, "Hola, " + input + "!", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
