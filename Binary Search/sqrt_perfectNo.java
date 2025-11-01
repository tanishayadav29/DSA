public class sqrt_perfectNo {

    // Brute Force Approach
    static int sqrtBrute(int n) {
        int i = 1;
        while (i * i <= n) {
            i++;
        }
        return i - 1;
    }

    // Binary Search Approach
    static int sqrtBinary(int n) {
        int left = 1, right = n, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                ans = mid; // Store result and continue to right half
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans; // Floor of sqrt if n is not perfect square
    }

    // Main Method
    public static void main(String[] args) {
        int n = 16;

        System.out.println("Brute Force Sqrt of " + n + ": " + sqrtBrute(n));
        System.out.println("Binary Search Sqrt of " + n + ": " + sqrtBinary(n));
    }
}
