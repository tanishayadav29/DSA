package Miscellaneous;
import java.util.*;
// given an array of lentgh A. task is to find the number of subarrays of A that contain the lentgh of the subarray.

public class containLength {
    public static void main(String[] args) {
        int total=0;
        int [] arr={3,1,4,2};
        for (int i=0;i<arr.length;i++){
            int count=0;
            List<Integer> subarray = new ArrayList<>();

            for ( int j=i;j<arr.length;j++){
                count++;
                subarray.add(arr[j]); 

                if( subarray.contains(count)){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
