package Matrix.BasicConcepts;

public class column_wise_row_rotation {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[][] matrix, int k) {
        int cols = matrix[0].length;
        k = k % cols;
        if (k == 0) return;

        for (int[] row : matrix) {
            reverse(row, 0, cols - 1);
            reverse(row, 0, k - 1);
            reverse(row, k, cols - 1);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 2;
        rotate(matrix, k);
    }
}
