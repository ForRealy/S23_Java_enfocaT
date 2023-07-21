package com.main;

import javax.swing.*;

public class Quiz {

    public static void main(String[] args) {
        String question = "¿Te gusta la pizza con piña?";
        String[] answers = {
            "Si, me encanta!",
            "No, puags!",
            "Mejor una 4 quesos",
            "Siguiente",
            "Salir"
        };

        Object[] options = {
            new JButton(answers[0]),
            new JButton(answers[1]),
            new JButton(answers[2]),
            new JButton(answers[3]),
            new JButton(answers[4])
        };

        int result = JOptionPane.showOptionDialog(null, question, "Quiz", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, answers[0]);
        } else if (result == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, answers[1]);
        } else if (result == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, answers[2]);
        } else {
            JOptionPane.showMessageDialog(null, answers[4]);
        }
    }
}
