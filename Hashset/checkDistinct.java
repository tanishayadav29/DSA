//wap to check whether all elements of an array is distinct or not using hashset
//other approaches to do this
//1. two pointer- set i at arr[0] and j at arr[i+1], now do it (try)
//2. using brute force O(n^2) and count variable
package Hashset;
import java.util.HashSet;
public class checkDistinct {
    public static void main(String[] args) {
        int[] arr={3,3,6,5,4,6,7,8,10,10};
        HashSet<Integer> set=new HashSet<>();
        for (int ele:arr){
            set.add(ele);
        }
        if (set.size()==arr.length){
            System.out.println("DISTINCT ELEMENT PRESENT");
        }
        else{
            System.out.println("DISTINCT ELEMENT NOT PRESENT");
        }
    }
}
