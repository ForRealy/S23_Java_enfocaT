package com.main;

import java.awt.*;
import javax.swing.*;

public class Container {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Fundación Esplai");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setBackground(Color.MAGENTA);
        frame.setIconImage(new ImageIcon("https://fundacionesplai.org/favicon.ico").getImage());
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

}
