//wap to find distinct number of elements in an array using hashset concept
package Hashset;
import java.util.HashSet;
public class num_distEle {
    public static void main(String[] args) {
        int[] arr={3,3,6,5,4,6,7,8,10,10};
        HashSet<Integer> set=new HashSet<>();
        for (int ele:arr){
            set.add(ele);
        }
        System.out.println("number of distinct elements:"+set.size());
    }
}
