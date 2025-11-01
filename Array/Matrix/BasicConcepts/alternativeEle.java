package Matrix.BasicConcepts;

public class alternativeEle {
    static void toggle(int [][]arr, int rows, int cols){
        int button=1;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols;j++){
                if (button==1){
                    System.out.print(arr[i][j]+" ");
                }
                button*=-1;
            }
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
        toggle(arr, rows, cols);
    }
}
