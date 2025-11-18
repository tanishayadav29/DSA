package Recursion;

public class climbingStairs {
    //this is recursive approach
    static int climbStairs(int n) {
        if (n<=1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

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
        int ans= climbStairs(4);
        System.out.println("answer for recursive answer.");
        System.out.println(ans);
        System.out.println();
        int ans2= climbStairs2(4);
        System.out.println("answer for dp problem");
        System.out.println(ans2);
    }
}

