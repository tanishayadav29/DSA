package LeetCode;


public class leetcode_1390 {

    // function
    public static int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            int divisor = 0;
            int sum = 0;

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    if (i == num / i) {
                        divisor += 1;
                        sum += i;
                    } else {
                        divisor += 2;
                        sum += i + (num / i);
                    }
                }
            }

            if (divisor == 4) {
                totalSum += sum;
            }
        }
        return totalSum;
    }

    // main method
    public static void main(String[] args) {

        int[] nums = {21, 4, 7};

        System.out.println(sumFourDivisors(nums));
    }
}
