package Matrix.subArray;

class QuerySum {
    // Step 1: Build prefix sum matrix
    static void psum(int [][] arr, int [][] psum_arr, int rows, int cols){
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (i==0 && j==0){
                    psum_arr[i][j] = arr[i][j];
                }
                else if (i==0){
                    psum_arr[i][j] = arr[i][j] + psum_arr[i][j-1];
                }
                else if (j==0){
                    psum_arr[i][j] = arr[i][j] + psum_arr[i-1][j];
                }
                else {
                    psum_arr[i][j] = arr[i][j] + psum_arr[i-1][j] 
                                    + psum_arr[i][j-1] - psum_arr[i-1][j-1];
                }
            }
        }
    }

    // Step 2: Query sum using prefix sum
    static int querySum(int [][] psum, int sx, int sy, int ex, int ey){
        int res = psum[ex][ey];

        if (sx > 0) res -= psum[sx-1][ey];
        if (sy > 0) res -= psum[ex][sy-1];
        if (sx > 0 && sy > 0) res += psum[sx-1][sy-1];

        return res;
    }

    // Step 2b: Brute-force query sum
    static int bruteForceSum(int [][] arr, int sx, int sy, int ex, int ey){
        int sum = 0;
        for(int i = sx; i <= ex; i++){
            for(int j = sy; j <= ey; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // Step 3: Run all queries using prefix sum
    static void processQueries(int [][] psum, int [][] arr, int [][][] queries){
        for (int i=0; i<queries.length; i++){
            int sx = queries[i][0][0];
            int sy = queries[i][0][1];
            int ex = queries[i][1][0];
            int ey = queries[i][1][1];

            int ansOptimized = querySum(psum, sx, sy, ex, ey);
            int ansBruteForce = bruteForceSum(arr, sx, sy, ex, ey);

            System.out.println("Query " + (i+1) + " ("+sx+","+sy+" to "+ex+","+ey+") -> " +
                               "PrefixSum = " + ansOptimized + ", BruteForce = " + ansBruteForce);
        }
    }

    // Utility: display matrix
    static void display(int [][] psum_arr,int r, int c){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(psum_arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        int [][] arr= {
            {1,2},
            {3,4}
        };

        int [][] psum_arr = new int[2][2];  // initialized to 0
        psum(arr, psum_arr, 2, 2);

        System.out.println("Prefix Sum Matrix:");
        display(psum_arr, 2, 2);

        int [][][] queries = {
            { {0,0}, {1,1} },  // full matrix
            { {0,1}, {1,1} },  // right column
            { {1,0}, {1,0} }   // single element
        };

        System.out.println("\nQuery Results (PrefixSum vs BruteForce):");
        processQueries(psum_arr, arr, queries);
    }
}
