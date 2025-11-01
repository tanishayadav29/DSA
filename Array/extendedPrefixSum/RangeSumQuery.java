package extendedPrefixSum;
public class RangeSumQuery {

    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] psum = new int[n];
        psum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + arr[i];
        }
        return psum;
    }

    public static void processQueries(int[] psum, int[][] queries) {
        for (int[] q : queries) {
            int l = q[0], r = q[1];
            int sum = (l == 0) ? psum[r] : psum[r] - psum[l - 1];
            System.out.println("Sum from " + l + " to " + r + " = " + sum);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 1, 3};
        int[][] queries = { {1, 4}, {2, 3}, {0, 2} };

        int[] psum = buildPrefixSum(arr);
        processQueries(psum, queries);
    }
}
