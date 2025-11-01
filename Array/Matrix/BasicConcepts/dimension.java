package Matrix.BasicConcepts;

import java.util.Arrays;

public class dimension {

    // Q1: Flatten a 3x3 matrix to 1D array
    static int[] flatten(int[][] arr, int rows, int cols) {
        int[] arr_new = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr_new[k] = arr[i][j];
                k++;
            }
        }
        return arr_new;
    }

    // Q2: Convert 1D array to 3x3 matrix
    static int[][] toMatrix(int[] arr1D, int rows, int cols) {
        int[][] arr_new = new int[rows][cols];
        int k = 0;
        for (int i = 0; i < rows && k < arr1D.length; i++) {
            for (int j = 0; j < cols; j++) {
                arr_new[i][j] = arr1D[k];
                k++;
            }
        }
        return arr_new;
    }

    // Utility: print matrix
    static void printMatrix(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int rows = 3;
        int cols = 3;

        // Flatten
        int[] flatArr = flatten(arr, rows, cols);
        System.out.println("Flattened array: " + Arrays.toString(flatArr));

        // Convert back to 3x3 matrix
        int[][] newMatrix = toMatrix(flatArr, rows, cols);
        System.out.println("Converted back to matrix:");
        printMatrix(newMatrix, rows, cols);
    }
}
