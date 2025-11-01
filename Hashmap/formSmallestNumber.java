//find thr smallest number that can be formed by rearranging the digitd of a given number in an array
package Hashmap;

import java.util.HashMap;

public class formSmallestNumber {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] A={2,3,2,6,7,4,0};
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            map.put(A[i], count);
        }

        for (int digit=0; digit<=9; digit++){
            if (map.containsKey(digit)) {
                for (int i=1; i<=map.get(digit); i++){
                    System.out.print(digit);
                }
            }
        }
    }
}
