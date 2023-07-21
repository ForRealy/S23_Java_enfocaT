package com.main;

import javax.swing.*;

public class QueueProgram {

    public static void main(String[] args) {
        int option = 0;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Queue Operations Menu\n" +
                    "1. Insert\n" +
                    "2. Delete\n" +
                    "3. Display\n" +
                    "4. Exit\n" +
                    "Enter your option:"));

            switch (option) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Insert operation", "Queue Operation", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Delete operation", "Queue Operation", JOptionPane.WARNING_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Display operation", "Queue Operation", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Exit operation", "Queue Operation", JOptionPane.QUESTION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option", "Queue Operation", JOptionPane.ERROR_MESSAGE);
            }
        } while (option != 4);
    }
}
