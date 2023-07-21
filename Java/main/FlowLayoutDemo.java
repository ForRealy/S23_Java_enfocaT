package com.main;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo {

    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    public FlowLayoutDemo() {
        frame = new JFrame("FlowLayout Demo");
        frame.setLayout(new GridLayout(1, 3));

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (int i = 1; i <= 8; i++) {
            if (i % 3 == 1) {
                JButton button = new JButton("Button " + i);
                panel1.add(button);
            }
        }

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        for (int i = 1; i <= 8; i++) {
            if (i % 3 == 2) {
                JButton button = new JButton("Button " + i);
                panel2.add(button);
            }
        }

        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        for (int i = 1; i <= 8; i++) {
            if (i % 3 == 0) {
                JButton button = new JButton("Button " + i);
                panel3.add(button);
            }
        }

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlowLayoutDemo();
            }
        });
    }
}
