public class FirstOccurenceBinarySearch {

    public static int findFirstIndex(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == k && (mid == 0 || arr[mid - 1] != k)) {
                return mid; // First occurrence found
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 10, 12, 14};
        int k = 4;

        int index = findFirstIndex(arr, k);
        if (index != -1) {
            System.out.println("First occurrence of " + k + " is at index: " + index);
        } else {
            System.out.println(k + " not found in the array.");
        }
    }
}
