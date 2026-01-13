package LeetCode;


public class leetcode_896 {

    public static void main(String[] args) {
        leetcode_896 obj = new leetcode_896();

        int[] nums = {1, 2, 2, 3};
        System.out.println(obj.isMonotonic(nums));
    }

    public boolean isMonotonic(int[] nums) {

        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dec = false;
            }
            if (nums[i] < nums[i - 1]) {
                inc = false;
            }
        }
        return inc || dec;
    }
}
