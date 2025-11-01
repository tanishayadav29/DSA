package Rotation;
public class RotatedArray {
    static void reverse( int[]arr, int start,int end ){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int size= nums.length;
        k=k%size;
        if (k==0){
            return;
        }
        reverse( nums,0,size-1);
        reverse(nums,0,k-1);
        reverse(nums,k,size-1);
        System.out.println(nums);
    }
    public static void main(String[] args) {
        int[] nums={4,1,6,9,2,14,7,8,3};
        int k=12;
        rotate(nums,k);
    }
}
