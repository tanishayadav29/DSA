package Matrix.BasicConcepts;

public class midRowandCol {

    // WAP to print middle row and middle column of a matrix
    // rows and cols are guaranteed to be odd
    static void q1(int [][] arr, int rows, int cols){
        int mid_col = cols / 2;
        int mid_row = rows / 2;

        System.out.println("Middle Column:");
        for (int i = 0; i < rows; i++){
            System.out.print(arr[i][mid_col] + " ");
        }
        System.out.println();

        System.out.println("Middle Row:");
        for (int j = 0; j < cols; j++){
            System.out.print(arr[mid_row][j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int rows = 3;
        int cols = 3;

        q1(arr, rows, cols);
    }
}
