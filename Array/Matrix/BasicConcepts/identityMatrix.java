package Matrix.BasicConcepts;

public class identityMatrix {

    // Method to check identity matrix
    static void identity(int[][] arr, int rows, int cols) {
        // Only square matrix can be identity
        if (rows != cols) {
            System.out.println("Not an identity matrix (non-square)");
            return;
        }

        int identity = 1; // assume matrix is identity

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == j && arr[i][j] != 1) || (i != j && arr[i][j] != 0)) {
                    identity = 0; // found non-identity element
                    break;       // break inner loop
                }
            }
            if (identity == 0) break; // break outer loop
        }

        if (identity == 0) {
            System.out.println("Not an identity matrix");
        } else {
            System.out.println("Identity matrix");
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
        int[][] arr1 = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = 3;
        int cols = 3;

        System.out.println("Matrix 1:");
        printMatrix(arr1, rows, cols);
        identity(arr1, rows, cols); // should print "Identity matrix"

        System.out.println("\nMatrix 2:");
        printMatrix(arr2, rows, cols);
        identity(arr2, rows, cols); // should print "Not an identity matrix"
    }
}
