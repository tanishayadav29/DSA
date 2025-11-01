public class closestLeastElement {
    static int solve(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int result=-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= x) {
                result = mid;
                left = mid + 1;
            }
            else
                right  = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 15, 23, 31, 42, 56, 67, 81, 99};
        int x = 31;
        int result = solve(arr, x);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
