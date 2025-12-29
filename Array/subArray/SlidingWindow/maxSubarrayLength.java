package subArray.SlidingWindow;

// given n elements print max subarray sum of length k.

public class maxSubarrayLength {
    static void brute(int[] arr, int k){
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            maxsum = Math.max(maxsum, sum);
        }

        System.out.println("Max subarray sum of length k using brute force is: " + maxsum);
    }

    static void brute2(int[] arr, int k) {
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            int count = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];     
                count++;         

                if (count == k) {  
                    if (sum > maxsum) {
                        maxsum = sum;
                    }
                    break;        
                }
            }
        }

        System.out.println("Max subarray sum of length k using brute2 count variable is: " + maxsum);
    }

    static void approach3( int[]arr, int k){
        int s=0;
        int e=k-1;
        int ans= Integer.MIN_VALUE;
        int size=arr.length;
        while (e<size){
            int sum=0;
            for(int i=s; i<=e;i++){
                sum+=arr[i];
            }
            if (sum>ans){
                ans=sum;
            }
            s++;
            e++;
        }
        System.out.println("max subarray sum of length k using Tc (n-(k-1)) is:"+ans);
    }

    static void prefix(int []arr,int k){
        int[] psum = new int[arr.length];
        psum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
               psum[i] = psum[i - 1] + arr[i];
        }

        int s = 0;
        int e = k - 1;
        int ans = Integer.MIN_VALUE;

        while (e < arr.length) {
            int sum;

            if (s == 0) {
            sum = psum[e];
            }
            else {
            sum = psum[e] - psum[s - 1];
            }

            if (sum > ans)
                ans = sum;

            s++;
            e++;
        }
        System.out.println("Max subarray sum using prefix array is: " + ans);
    }

    static void sliding_window(int[]arr, int k){
        int sum=0;
        for (int i=0; i<k;i++){
            sum+=arr[i];
        }
        int ans=sum;
        int s=1;
        int e=k;
        int size=arr.length;
        while(e<size){
            sum=sum+arr[e]-arr[s-1];
            if (sum>ans){
                ans=sum;
            }
            e++;
            s++;
        }
        System.out.println("Max subarray sum using SLIDING WINDOW APPROACH array is: " + ans);
    }
    public static void main(String[] args) {
        int[] arr={-1,3,-2,15,3,-2,8,2,-1,4};
        int k=5;
        brute(arr, k);
        brute2(arr, k);
        approach3(arr, k);
        prefix(arr, k);
        sliding_window(arr, k);
    }
}
