public class sortedRotatedarraySearch {
    public static int findIndex(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == k) {
                return mid;  // Element found
            }
            else if (arr[mid] < k) {
                left = mid + 1;  // Search right half
            }
            else {
                right = mid - 1; // Search left half
            }
        }

        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 12, 15,1,3,5};
        int k = 9;
        int index = findIndex(arr, k);
        if (index != -1) {
            System.out.println("Element " + k + " found at index: " + index);
        } else {
            System.out.println("Element " + k + " not found in array.");
        }
    }
}
