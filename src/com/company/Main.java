package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = initializeMatrix();
        System.out.println("Original Matrix");
        int[][] getMatrix = printMatrix(matrix);
        System.out.println("Rotated Matrix");
        int[][] getMatrix90 = printMatrix90(matrix);
    }

    private static int[][] initializeMatrix() {
        Random random = new Random();
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(100);
            }
            System.out.println();
        }
        return matrix;
    }

    static int[][] printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    static int[][] printMatrix90(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
}

