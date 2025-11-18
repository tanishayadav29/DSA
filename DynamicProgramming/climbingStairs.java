package DynamicProgramming;

public class climbingStairs {

    //dp approach
    static int climbStairs2(int n) {
        int arr[]=new int[n];
        arr[0]=1;
        if (n>1){
            arr[1]=2;
            for(int i=2;i<n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        int ans2= climbStairs2(4);
        System.out.println("answer for dp problem");
        System.out.println(ans2);
    }
}



