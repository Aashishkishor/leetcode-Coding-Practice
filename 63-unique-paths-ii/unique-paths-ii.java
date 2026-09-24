class Solution {
    int[][] dp = new int[102][102];
   private long fun(int i, int j, int[][] grid, int n, int m) {
        if (i >= n || j >= m || i < 0 || j < 0 || grid[i][j] == 1) return 0;
        if (i == n - 1 && j == m - 1) return 1;
        
        if (dp[i][j] != -1) return dp[i][j];
        
        long c1 = fun(i + 1, j, grid, n, m);
        long c2 = fun(i, j + 1, grid, n, m);
        
        dp[i][j] = (int) (c1 + c2);
        return c1 + c2;
    }

    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) return 0;
        
        dp = new int[102][102];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return (int) fun(0, 0, grid, n, m);
        
    }
}