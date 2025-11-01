public class rotatedArraySmallestElement {
    public static int findIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == arr[right]) {
                return arr[mid];  // Element found
            }
            else if (arr[mid] > arr[right]) {
                left = mid + 1;  // Search right half
            }
            else {
                right = mid - 1; // Search left half
            }
        }

        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 12, 15,1,3,5,0};
        int ans = findIndex(arr);
        System.out.println("Element " + ans + " is smallest element in array.");

    }
}
