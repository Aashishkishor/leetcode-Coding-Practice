class Solution {
    public int minOperations(int[] nums, int k) {
         int operations = 0;

        for (int num : nums) {
            if (num < k) {
                operations++;
            }
        }

        return operations;
        
    }
}