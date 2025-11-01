package Matrix.BasicConcepts;

public class lowerTriangleZero {

    // Set lower triangle elements to 0
    static void ques(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i > j) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    // Utility function to print matrix
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

        ques(arr, rows, cols);

        System.out.println("\nLower triangle set to 0:");
        printMatrix(arr, rows, cols);
    }
}
