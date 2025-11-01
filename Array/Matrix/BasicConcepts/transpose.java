package Matrix.BasicConcepts;

public class transpose {
    // Transpose matrix in-place (only for square matrix) method 1
    static void q1(int [][]arr, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Transpose matrix in-place (only for square matrix) method 2
    static void q2(int [][]arr, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i>j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
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

        q1(arr, rows, cols);
        q2(arr, rows, cols);

        System.out.println("Transpose Matrix:");
        printMatrix(arr, cols, rows);
    }
}
