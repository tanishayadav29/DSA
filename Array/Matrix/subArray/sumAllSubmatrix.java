package Matrix.subArray;

public class sumAllSubmatrix {

    // Calculates sum of all submatrices in an N x M matrix using int
    public static int sumOfAllSubmatrices(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        int total = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                total += matrix[i][j] * (i + 1) * (j + 1) * (N - i) * (M - j);
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
        System.out.println("Total Sum of all Submatrices: " + sumOfAllSubmatrices(matrix));

        int[][] matrix2 = { {1, 1}, {1, 1} };
        System.out.println("Total Sum of all Submatrices: " + sumOfAllSubmatrices(matrix2));
    }
}
