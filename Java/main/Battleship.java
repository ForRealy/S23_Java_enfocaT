package com.main;

import java.util.Scanner;

public class Battleship {

    public Battleship(int selectedLevel) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Bienvenido al juego de Battleship");
			System.out.println("Seleccione el nivel de dificultad:");
			System.out.println("1. Facil");
			System.out.println("2. Medio");
			System.out.println("3. Dificil");

			int selectedLevel = scanner.nextInt();
			while (selectedLevel < 1 || selectedLevel > Battleship.getDifficultyLevels()) {
			    System.out.println("Nivel de dificultad no valido. Seleccione nuevamente:");
			    selectedLevel = scanner.nextInt();
			}

			Battleship game = new Battleship(selectedLevel);

			while (!game.isGameOver()) {
			    System.out.println("Tablero de juego:");
			    printBoard(game.getBoard());
			    System.out.print("Introduzca la fila (0-9): ");
			    int row = scanner.nextInt();
			    System.out.print("Introduzca la columna (0-9): ");
			    int col = scanner.nextInt();

			    game.fire(row, col);
			}
		}

        System.out.println("Felicidades");
    }

    private void fire(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	private int[][] getBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	private static int getDifficultyLevels() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 0 || cell == -1) {
                    System.out.print(". ");
                } else {
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }
    }
}

