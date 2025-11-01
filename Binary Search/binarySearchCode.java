public class binarySearchCode {

    // Binary Search Method
    static int solve(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == x)
                return mid; // Found target at index mid
            else if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // Target not found
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr = {3, 7, 15, 23, 31, 42, 56, 67, 81, 99}; // Sorted array
        int x = 31; // Element to search

        int result = solve(arr, x);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
