package Graph.LeetCode;

/*
 * Problem: Flood Fill
 *
 * Given a 2D image, starting from a source pixel (sr, sc),
 * change the color of the source pixel and all adjacent pixels
 * (up, down, left, right) having the same original color
 * to a new given color.
 *
 * Approach:
 * - Use DFS (Depth First Search)
 * - Store the original color (targetColour)
 * - Traverse in 4 directions
 * - Replace targetColour with new color
 */



class FloodFill{

    // Flood Fill function
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int r = image.length;        // number of rows
        int c = image[0].length;     // number of columns

        // Direction arrays: up, down, left, right
        int[] di = {-1, 1, 0, 0};
        int[] dj = {0, 0, -1, 1};

        // Original color of starting pixel
        int targetColour = image[sr][sc];

        // If new color is same as original, no change needed
        if (targetColour == color) {
            return image;
        }

        // Start DFS
        dfsRec(sr, sc, r, c, image, di, dj, color, targetColour);

        return image;
    }

    // DFS recursive function
    void dfsRec(int i, int j, int r, int c, int[][] image,
                int[] di, int[] dj, int color, int targetColour) {

        // Boundary check + color check
        if (i < 0 || i >= r || j < 0 || j >= c || image[i][j] != targetColour) {
            return;
        }

        // Change the color
        image[i][j] = color;

        // Visit all 4 directions
        for (int k = 0; k < 4; k++) {
            dfsRec(i + di[k], j + dj[k], r, c, image, di, dj, color, targetColour);
        }
    }

    // MAIN METHOD (System execution)
    public static void main(String[] args) {

        FloodFill obj = new FloodFill();

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1, sc = 1;
        int newColor = 2;

        int[][] result = obj.floodFill(image, sr, sc, newColor);

        // Print output image
        System.out.println("Flood Filled Image:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
