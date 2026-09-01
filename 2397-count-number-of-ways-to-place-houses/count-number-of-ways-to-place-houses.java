class Solution {
    public int countHousePlacements(int n) {
       
        long MOD = 1000000007;
        long prev2 = 1;
        long prev1 = 2;
        
        for (int i = 2; i <= n; i++) {
            long current = (prev1 + prev2) % MOD;
            prev2 = prev1;
            prev1 = current;
        }
        
        return (int) ((prev1 * prev1) % MOD);
    }
}
        