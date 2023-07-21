package com.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AnimalQuiz {

    public static void main(String[] args) {
        String[] animals = {"Lobo", "Tigre", "León", "Elefante", "Ballena"};

        String selectedAnimal = animals[0];

        JOptionPane.showOptionDialog(null, "¿Cuál es tu animal favorito?", "Animal Quiz", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, animals, selectedAnimal);

        String animalImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Wolf-gray.jpg/1200px-Wolf-gray.jpg";

        try {
            BufferedImage animalImage = ImageIO.read(new URL(animalImageUrl));
            JOptionPane.showMessageDialog(null, animalImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
