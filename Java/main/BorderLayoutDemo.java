package com.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutDemo {

    private JFrame frame;
    public BorderLayoutDemo() {
        frame = new JFrame("Border Layout Demo");
        frame.setLayout(new BorderLayout());

        createPanel(Color.red, BorderLayout.NORTH, "North");
        createPanel(Color.blue, BorderLayout.WEST, "West");
        createPanel(Color.yellow, BorderLayout.CENTER, "Center");
        createPanel(Color.red, BorderLayout.SOUTH, "South");
        createPanel(Color.blue, BorderLayout.EAST, "East");

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.addMouseListener(new CustomMouseListener());
    }

    private JPanel createPanel(Color color, String position, String text) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.add(new JLabel(text));
        panel.setName(position + "Panel");
        frame.add(panel, position);
        return panel;
    }

    private class CustomMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            JPanel clickedPanel = (JPanel) e.getComponent().getParent();
            String position = clickedPanel.getName();
            JOptionPane.showMessageDialog(frame, "Has pulsado " + position);
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BorderLayoutDemo();
            }
        });
    }
}

