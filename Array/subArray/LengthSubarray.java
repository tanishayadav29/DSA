package subArray;

// Given an array of length n,
// task is to find the number of subarrays of array A
// such that the subarray contains its own length as an element.

import java.util.*;

public class LengthSubarray {

    static int solve(int[] aa){
        int n = aa.length;
        int total = 0;

        for(int i = 0; i < n; i++){
            int count = 0;
            ArrayList<Integer> subarray = new ArrayList<>();

            for(int j = i; j < n; j++){
                count++;                 // length of current subarray
                subarray.add(aa[j]);

                if(subarray.contains(count)){
                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] aa = {1, 2, 3, 4};
        System.out.println(solve(aa));
    }
}
