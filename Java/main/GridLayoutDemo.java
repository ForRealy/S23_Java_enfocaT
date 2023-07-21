package com.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GridLayoutDemo {

    private JFrame frame;
    private JPanel panel;
    private String[] names = {"Contacts", "Messages", "Call Log", "Games", "Settings", "Applications", "Music", "Gallery", "Organizer"};

    public GridLayoutDemo() {
        frame = new JFrame("GridLayout Demo");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton(names[i]);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Has pulsado " + e.getActionCommand());
                }
            });
            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GridLayoutDemo();
            }
        });
    }
}

