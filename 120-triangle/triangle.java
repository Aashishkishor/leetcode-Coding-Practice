 class Solution {
    int[][] dp = new int[201][201];
    private int fun(List<List<Integer>> triangle, int i, int j){
        if(i >= triangle.size() || j >= triangle.get(i).size()) return 100000;
        if(dp[i][j] != -100000) return dp[i][j];
        if(i == triangle.size() - 1) return triangle.get(i).get(j);
        int a = triangle.get(i).get(j) + fun(triangle, i + 1, j);
        int b = triangle.get(i).get(j) + fun(triangle, i + 1, j + 1);

        return dp[i][j] = Math.min(a, b);

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = 0; i < 201; i++) Arrays.fill(dp[i], -100000);
        return fun(triangle, 0, 0);
    }
}
        
