class Solution {
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        
        int res = 1;
        int dp1 = 1;
        int dp2 = 1;
        
        for (int i = 1; i < nums1.length; i++) {
            int nextDp1 = 1;
            int nextDp2 = 1;
            
            if (nums1[i] >= nums1[i - 1]) {
                nextDp1 = Math.max(nextDp1, dp1 + 1);
            }
            if (nums1[i] >= nums2[i - 1]) {
                nextDp1 = Math.max(nextDp1, dp2 + 1);
            }
            
            if (nums2[i] >= nums1[i - 1]) {
                nextDp2 = Math.max(nextDp2, dp1 + 1);
            }
            if (nums2[i] >= nums2[i - 1]) {
                nextDp2 = Math.max(nextDp2, dp2 + 1);
            }
            
            dp1 = nextDp1;
            dp2 = nextDp2;
            res = Math.max(res, Math.max(dp1, dp2));
        }
        
        return res;
    }
}