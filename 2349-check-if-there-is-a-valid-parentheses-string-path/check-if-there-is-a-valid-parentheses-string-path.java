class Solution {
    Boolean[][][] memo;
    int m, n;
    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        
        if ((m + n - 1) % 2 != 0) {
            return false;
        }
        
        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(') {
            return false;
        }

        memo = new Boolean[m][n][205];
        
        return dfs(grid, 0, 0, 0);
    }

    private boolean dfs(char[][] grid, int r, int c, int balance) {
        if (grid[r][c] == '(') {
            balance++;
        } else {
            balance--;
        }

        if (balance < 0) {
            return false;
        }

        if (r == m - 1 && c == n - 1) {
            return balance == 0;
        }

        if (memo[r][c][balance] != null) {
            return memo[r][c][balance];
        }

        boolean isValid = false;
        
        if (r + 1 < m) {
            isValid = isValid || dfs(grid, r + 1, c, balance);
        }
        
        if (c + 1 < n) {
            isValid = isValid || dfs(grid, r, c + 1, balance);
        }

        memo[r][c][balance] = isValid;
        
        return isValid;
        
    }
}