package extendedPrefixSum;

public class CountEvenNoRange {

    // Step 1: Build prefix sum of even number count
    public static int[] buildEvenPrefixCount(int[] arr) {
        int n = arr.length;
        int[] psum = new int[n];
        psum[0] = (arr[0] % 2 == 0) ? 1 : 0;

        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + ((arr[i] % 2 == 0) ? 1 : 0);
        }
        return psum;
    }

    // Step 2: Process queries using prefix sum
    public static void processQueries(int[] psum, int[][] queries) {
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int count = (l == 0) ? psum[r] : psum[r] - psum[l - 1];
            System.out.println("Even count from " + l + " to " + r + " = " + count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 1, 4};
        int[][] queries = { {0, 2}, {1, 4}, {2, 3}, {0, 0} };

        int[] psum = buildEvenPrefixCount(arr);
        processQueries(psum, queries);
    }
}
