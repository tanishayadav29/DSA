package Recursion;
//find the maximum subsequence sum where selecting adjacent elements is not allowed.
public class maxSubsequence {
    //first we will go forward recursion, here i will start incrementing from 0
    static int solve1(int i, int arr[]){
        if( i>=arr.length){
            return 0;
        }
        int s1= arr[i]+solve1(i+2,arr);
        int s2= solve1(i+1,arr);
        return Math.max(s1,s2);
    }

    //first we will go backward recursion, here i will decrement from n
    static int solve2(int i, int arr[]){
        if( i<0){
            return 0;
        }
        int s1= arr[i]+solve2(i-2,arr);
        int s2= solve2(i-1,arr);
        return Math.max(s1,s2);
    }
    public static void main(String[] args) {
        int[] arr={9,4,13,24};

        int ans1=solve1(0, arr);
        System.out.println("answer using forward direction recursion: "+ans1);

        System.out.println();

        int ans2=solve2(arr.length-1, arr);
        System.out.println("answer using forward direction recursion: "+ans2);
    }
}
