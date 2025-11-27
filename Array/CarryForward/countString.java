package CarryForward;

//given a string of lowercase letters return count of i,j sucht that i<j and s[i]=a and s[j]=g

//brute force; O(n^2)
//initialise count=0, for loop, if i=='a', then another for loop from next element and if 'g' count++

public class countString {
    public static void main(String[] args) {
        int count = 0;
        int total_count = 0;
        String s = "abegag";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                count++;   // count how many 'a' seen till now
            }

            if (s.charAt(i) == 'g') {
                total_count += count;   // add all previous 'a's
            }
        }

        System.out.println("Total pairs = " + total_count);
    }
}
