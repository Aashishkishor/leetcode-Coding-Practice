class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int  n= arr.length;
       int[]dp= new int[n+1]; // first i element max and also give to space or assign
       for(int i= 0;i<=n;i++){ //1 se start karo, n tak jao, aur har baar i ko 1 se badhao.
        int max =0;
         for (int j = 1; j <= k && j <= i; j++) { // current/last element =J
                
                max = Math.max(max, arr[i - j]); // tell about the elemnts

                int b= dp[i - j] + max * j;

                dp[i] = Math.max(dp[i], b); }


       }
       return dp[n];
    }
}