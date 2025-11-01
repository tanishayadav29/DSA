//wap to check if an array  A contains a pair i,j such that the sum of a[i]+a[j]=k and i!=j
//k is the target sum
//Hashset cant be used sine one of the leetcode cases will burst
//other approaches
//1. brute force o(n^2)
//2. two pointer appraoch 0(n)
package Hashmap;
import java.util.HashMap;

public class pairSum {
    public static void main(String[] args) {
        int[] arr = {8,9,1,-2,4,5,11,-6,7,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        //k is the target sum here
        int k = 10;

        // creation of hashmap 
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // count frequency of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            hm.put(arr[i], count);
        }

        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = k - arr[i];
            if (a != b && hm.containsKey(b)) {
                check = 1;
            }
            if (a == b && hm.get(b) > 1) {
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("FALSE, TARGET SUM NOT PRESENT");
        }
        else{
            System.out.println("TRUE, TARGET SUM PRESENT");
        }
    }
}
