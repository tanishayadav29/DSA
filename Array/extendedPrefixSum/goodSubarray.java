package extendedPrefixSum;

// given an array of integer A, it is said to be good if it fulfills anyone criteria,
//1 length of the subarray is even and the sum of all thr element of the subarray must be less than b.
//2 length of subarray is odd and sum of all element of the subarray must be greater than b.

public class goodSubarray {
    static int[] prefix(int[] arr){
        int n = arr.length;
        int[] psum = new int[n];
        psum[0] = arr[0];

        for(int i = 1; i < n; i++){
            psum[i] = psum[i - 1] + arr[i];
        }
        return psum;
    }
    static int solve(int[]psum, int b){
        int count=0;
        for(int i=0; i<psum.length;i++){
            for(int j=i; j<psum.length;j++){
                int sum=0;
                if(i==0){
                    sum+=psum[j];
                }
                else{
                    sum+=psum[j]-psum[i-1];
                }
                if( (j-i+1)%2==0 && sum<b){
                    count++;
                }
                if( (j-i+1)%2 != 0 && sum>b){
                    count++;
                }
            }
        }
        return count;
    }
    static int solve2(int [] psum,int [] arr, int b){
        int count=0;
        for (int i=0; i<psum.length; i++){
            int sum=0;
            for( int j=i; j<psum.length; j++){
                sum+=arr[j];
                if ( (j-i+1)%2==0 && sum<b){
                    count++;
                }
                if( (j-i+1)%2!=0 && sum>b){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int b = 4;

        int[] psum = prefix(arr);
        int ans = solve(psum, b);

        System.out.println(ans);

        
        int ans2 = solve2(psum,arr, b);

        System.out.println(ans2);
    }
}
