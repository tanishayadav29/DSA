package Matrix.BasicConcepts;

public class diagonal {

    // Q1: Main diagonal using O(n^2)
    static void q1(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // Q2: Main diagonal using O(n)
    static void q2(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    }

    // Q3: Secondary diagonal using O(n^2)
    static void q3(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i + j == rows - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // Q4: Secondary diagonal using O(n) approach 1
    static void q4(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            System.out.print(arr[i][rows - 1 - i] + " ");
        }
        System.out.println();
    }

    // Q5: Secondary diagonal using O(n) approach 2
    static void q5(int[][] arr, int rows, int cols) {
        int i = 0, j = cols - 1;
        while (i < rows && j >= 0) {
            System.out.print(arr[i][j] + " ");
            i++;
            j--;
        }
        System.out.println();
    }

    // Q6: Print all right-to-left diagonals (upper-left triangle not printed)
    static void q6(int[][] arr, int rows, int cols) {
        for (int k = 0; k < rows; k++) {
            int i = k;
            int j = cols - 1;
            while (i < rows && j >= 0) {
                System.out.print(arr[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }
    }

    // Q7: Sum of both diagonals (odd square matrix, common element counted once)
    static void q7(int[][] arr, int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) sum += arr[i][j];             // main diagonal
                if (i + j == rows - 1) sum += arr[i][j];  // secondary diagonal
            }
        }
        int mid = rows / 2;       // subtract middle element once
        sum -= arr[mid][mid];
        System.out.println("Sum of both diagonals: " + sum);
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

        System.out.println("Original Matrix:");
        printMatrix(arr, rows, cols);

        System.out.print("Q1 - Main diagonal (O(n^2)): ");
        q1(arr, rows, cols);

        System.out.print("Q2 - Main diagonal (O(n)): ");
        q2(arr, rows, cols);

        System.out.print("Q3 - Secondary diagonal (O(n^2)): ");
        q3(arr, rows, cols);

        System.out.print("Q4 - Secondary diagonal (O(n), method 1): ");
        q4(arr, rows, cols);

        System.out.print("Q5 - Secondary diagonal (O(n), method 2): ");
        q5(arr, rows, cols);

        System.out.println("Q6 - Right-to-left diagonals (upper-left triangle not printed):");
        q6(arr, rows, cols);

        System.out.println("Q7 - Sum of both diagonals:");
        q7(arr, rows, cols);
    }
}
