package extendedPrefixSum;

// given an array A of n non negtaive numbers and a number b a non negatuve number. you need to find the number of subarrays in A with a sum less than b. We may assume that there is no overflow.
public class lessThanSum {
    static int prefix(int []arr,int b){
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int count=0;

        for (int i=0;i<arr.length;i++){
        
            for (int j=i;j<arr.length;j++){
                int sum;
                if (i==0){
                    sum=prefix[j];
                }
                else{
                    sum=prefix[j]-prefix[i-1];
                }
                if (sum<b){
                    count++;
                }
            }
        }
        System.out.println("number of subarrays with sum less than the given number b is: "+count);
        return count;
    }

    public static void main(String[] args) {
        int[] arr={2,5,6};
        int b=10;
        prefix(arr, b);
        System.out.println(prefix(arr, b));
    }
}
