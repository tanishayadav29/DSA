package Matrix.BasicConcepts;

public class reverse_row {

    // Reverse a single row
    static void reverse(int[] row) {
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    // Reverse each row of the matrix
    static void ques(int[][] arr, int rows, int cols) {
        for (int[] row : arr) {
            reverse(row);
        }
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

        ques(arr, rows, cols);

        System.out.println("Matrix after reversing each row:");
        printMatrix(arr, rows, cols);
    }
}
