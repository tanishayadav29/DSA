//given a 1D unsorted array A containing n intetger, youre also given an integer B. find if there exists an element in array whose difference is B. 
package Hashset;

import java.util.HashSet;

public class pairGivenDifference {
    static int check(int[] A, int B){
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < A.length; i++){
            if (result.contains(A[i] - B) || result.contains(A[i] + B)){
                return 1;
            }
            result.add(A[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {5,10,3,2,50,80};
        int B = 78;
        int ans = check(A, B);
        if (ans == 1){
            System.out.println("Pair Given Difference found");
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
}
