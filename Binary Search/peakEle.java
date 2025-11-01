public class peakEle {
    public static int solve(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if ( (mid==0||arr[mid-1]<arr[mid])  && (mid == arr.length-1 || arr[mid + 1] < arr[mid])) {
                return arr[mid];
            }
            if (mid==0||arr[mid]>arr[mid-1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a ={2,3,5,8,5,6,7,9,2,1,0};
        int ans= solve(a);
        System.out.println("peak element is:"+ans);
    }
}
