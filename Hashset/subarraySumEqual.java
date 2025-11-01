//wap to check if there exists an subarray in an array of size n, which has sum=0 or not
//other approaches
//1. brute force: TC O(n^3) SC O(1)
//2. prefix sum: TC O(n^2) SC O(n)
//3. carry forward: TC O(n^2) SC O(n)

//approach here tc o(n) sc o(n)
//if psum[] numbers are repeating, there exists a subarray with sum 0
//AND
//if psum[] even if single 0 present, then subarray with 0 is present
package Hashset;
import java.util.HashSet;

public class subarraySumEqual {
    public static void main(String[] args) {
        int[] arr = {3,3,0,6,5,4,6,7,8,10,10};
        HashSet<Integer> set = new HashSet<>();

        //psum array creation
        int[] psum = new int[arr.length];
        psum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i - 1] + arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            if (psum[i]==0){
                System.out.println("TRUE, SUM=0 PRESENT");
            }
            set.add(psum[i]);
        }
        if (set.size()<arr.length){
            System.out.println("TRUE, SUM=0 PRESENT");
        }
        else{
            System.out.println("FALSE, SUM=0 NOT PRESENT");
        }
    }
}
