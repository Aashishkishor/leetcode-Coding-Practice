class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] dp = new int[n];
        
        for (int j = 0; j < n; j++) {
            dp[j] = grid[0][j];
        }
        
        for (int i = 0; i < m - 1; i++) {
            int[] nextDp = new int[n];
            java.util.Arrays.fill(nextDp, Integer.MAX_VALUE);
            
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                for (int nextCol = 0; nextCol < n; nextCol++) {
                    int cost = dp[j] + moveCost[val][nextCol] + grid[i + 1][nextCol];
                    nextDp[nextCol] = Math.min(nextDp[nextCol], cost);
                }
            }
            dp = nextDp;
        }
        
        int minCost = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            minCost = Math.min(minCost, dp[j]);
        }
        
        return minCost;
        
    }
}