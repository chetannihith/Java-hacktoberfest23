package DSA;

public class ChocolatePickup {
    /*
    Time complexity: O(R * (C^2))
    Space complexity: O(C^2)

    Where 'R' is the number of rows and 'C' is the number of columns in the grid.
    */

    /*
    Problem Description
    * Ninja has a 'GRID' of size 'R' X 'C'.
    * Each cell of the grid contains some chocolates.
    * Ninja has two friends Alice and Bob, and he wants to collect as many chocolates as possible with the help of his friends.
    * Initially, Alice is in the top-left position i.e. (O, O), and Bob is in the top-right place i.e. (O, 'C' - 1) in the grid.
    * Each of them can move from their current cell to the cells just below them.
    * When anyone passes from any cell, he will pick all chocolates in it, and then the number of chocolates in that cell will become zero.
    * If both stay in the same cell, only one of them will pick the chocolates in it.
    * If Alice or Bob is at (i, j) then they can move to (i + 1, j), (i + 1, j - 1) or (i + 1, j + 1). They will always stay inside the 'GRID'.
    * Your task is to find the maximum number of chocolates Ninja can collect with the help of his friends by following the above rules.
    * Link : https://www.codingninjas.com/studio/problems/ninja-and-his-friends_3125885
     */
    public static int maximumChocolates(int r, int c, int[][] grid) {
        // Initializing the 'prev_dp' vector.
        int[][] prev_dp = new int[c][c];

        // Running a loop from 0 to 'r'.
        for (int row = 0; row < r; row++) {

            // Initializing a 'current_dp' vector.
            int[][] current_dp = new int[c][c];

            // Running a loop from 0 to 'min(c, row + 1)'.
            for (int c1 = 0; c1 < Math.min(c, row + 1); c1++) {

                // Running a loop from 'max(0, c - 1 - row)' to 'c'.
                for (int c2 = Math.max(0, c - 1 - row); c2 < c; c2++) {

                    // Initializing a variable 'prev_max'.
                    int prev_max = 0;
                    for (int offset1 = Math.max(0, c1 - 1);
                         offset1 <= Math.min(c - 1, c1 + 1); offset1++) {

                        for (int offset2 = Math.max(0, c2 - 1);
                             offset2 <= Math.min(c - 1, c2 + 1); offset2++) {

                            // Updating the variable 'prev_max'.
                            prev_max = Math.max(prev_max, prev_dp[offset1][offset2]);
                        }
                    }

                    // Case when both are in same row.
                    if (c1 == c2) {
                        current_dp[c1][c2] = prev_max + grid[row][c1];
                    } else {
                        current_dp[c1][c2] = prev_max + grid[row][c1] + grid[row][c2];
                    }
                }
            }

            prev_dp = current_dp;
        }

        int res = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                // Updating the variable 'res' with max possible answer.
                res = Math.max(res, prev_dp[i][j]);
            }
        }

        return res;
    }
}
