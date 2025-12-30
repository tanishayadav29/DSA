package Graph.LeetCode;

public class FindTownJudge {

    public static int findJudge(int n, int[][] trust) {
        int[] res = new int[n];

        for (int[] edge : trust) {
            res[edge[0] - 1]--; // trusts someone
            res[edge[1] - 1]++; // trusted by someone
        }

        for (int i = 0; i < n; i++) {
            if (res[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 4;
        int[][] trust = {
            {1, 3},
            {2, 3},
            {4, 3}
        };

        int judge = findJudge(n, trust);

        if (judge == -1) {
            System.out.println("No Town Judge found");
        } else {
            System.out.println("Town Judge is: " + judge);
        }
    }
}
