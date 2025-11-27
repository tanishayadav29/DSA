package subArray;

public class sumEachSubarray {
    static void brute(int[]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int sum=0;
                for (int k=i;k<=j;k++){
                    sum+=arr[k];
                }System.out.println(sum);
            }
        }
    }

    static void prefix(int []arr){
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i=0;i<arr.length;i++){
        
            for (int j=i;j<arr.length;j++){
                int sum;
                if (i==0){
                    sum=prefix[j];
                }
                else{
                    sum=prefix[j]-prefix[i-1];
                }
                System.out.println(sum);
            }
        }
    }

    static void carryforward(int[]arr){
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println("using brute force:");
        brute(arr);

        System.out.println("using prefix sum:");
        prefix(arr);

        System.out.println("using carry forward:");
        carryforward(arr);
    }
    
}
