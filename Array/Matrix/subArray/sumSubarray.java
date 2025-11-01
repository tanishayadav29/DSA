package Matrix.subArray;

public class sumSubarray {

    static int answer(int[][] arr, int i_left, int j_left, int i_right, int j_right) {
        int sum = 0;
        for (int i = i_left; i <= i_right; i++) {
            for (int j = j_left; j <= j_right; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // subarray from (1,2) to (2,2)
        int result = answer(arr, 1, 2, 2, 2); 
        System.out.println("Subarray sum = " + result);

        // subarray from (0,1) to (2,2)
        System.out.println("Subarray sum = " + answer(arr, 0, 1, 2, 2));
    }
}
