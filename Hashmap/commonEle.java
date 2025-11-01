package Hashmap;

import java.util.*;

public class commonEle {
    public static void main(String[] args) {
        int[] A ={1,2,2,1};
        int[] B ={1,2,3,2};
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            map.put(A[i], count);
        }
        ArrayList<Integer> result= new ArrayList<>();
        for (int y : B) {
            if (map.containsKey(y) && map.get(y) > 0) {
                result.add(y);
                map.put(y, map.get(y) - 1); 
            }
        }
        System.out.println(result);
    }
}
