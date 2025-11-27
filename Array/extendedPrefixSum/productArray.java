package extendedPrefixSum;
import java.util.Arrays;

public class productArray {

    // ========== METHOD 1: OPTIMIZED PREFIX (NO EXTRA ARRAYS) ==========
    static int[] productOptimized(int[] arr) {

        int[] prod = new int[arr.length];
        int ans = 1;

        // LEFT PREFIX
        for (int i = 0; i < arr.length; i++) {
            prod[i] = ans;
            ans *= arr[i];
        }

        // RIGHT PREFIX
        ans = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            prod[i] *= ans;
            ans *= arr[i];
        }

        return prod;
    }


    // ========== METHOD 2: LP & RP ARRAYS ==========
    static int[] productWithLP_RP(int[] arr) {

        int n = arr.length;
        int[] LP = new int[n];
        int[] RP = new int[n];
        int[] OP = new int[n];

        // LP ARRAY
        LP[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LP[i] = LP[i - 1] * arr[i];
        }

        // RP ARRAY
        RP[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RP[i] = RP[i + 1] * arr[i];
        }

        // FINAL OUTPUT
        for (int i = 0; i < n; i++) {
            if (i == 0)
                OP[i] = RP[i + 1];
            else if (i == n - 1)
                OP[i] = LP[i - 1];
            else
                OP[i] = LP[i - 1] * RP[i + 1];
        }

        // TINY PRINT
        System.out.println("LP = " + Arrays.toString(LP));
        System.out.println("RP = " + Arrays.toString(RP));

        return OP;
    }


    // ========== MAIN FUNCTION ==========
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Method 1 call
        int[] result1 = productOptimized(arr);
        System.out.println("Optimized Output = " + Arrays.toString(result1));

        System.out.println();

        // Method 2 call
        int[] result2 = productWithLP_RP(arr);
        System.out.println("LP-RP Output = " + Arrays.toString(result2));
    }
}
