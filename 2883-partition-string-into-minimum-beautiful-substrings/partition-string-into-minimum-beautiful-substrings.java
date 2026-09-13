class Solution {
    public int minimumBeautifulSubstrings(String s) {
        
        int n = s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    continue;
                }
                int val = 0;
                for (int k = j; k < i; k++) {
                    val = (val << 1) + (s.charAt(k) - '0');
                }
                if (val > 0 && 15625 % val == 0) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[n] > n ? -1 : dp[n];
    }
}