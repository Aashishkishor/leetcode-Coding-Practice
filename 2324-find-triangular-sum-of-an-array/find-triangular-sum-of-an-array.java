class Solution {
    public int triangularSum(int[] nums) {
        
        int n = nums.length;
        for (int o = n - 1; o > 0; o--) {
            for (int i = 0; i < o; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }
        return nums[0];
        
    }
}