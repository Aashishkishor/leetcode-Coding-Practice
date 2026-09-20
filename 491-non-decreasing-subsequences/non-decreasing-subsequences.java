class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
    findSequences(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void findSequences(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (current.size() >= 2) {
            result.add(new ArrayList<>(current));
        }

        Set<Integer> seen = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                continue;
            }
            
            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                seen.add(nums[i]);
                current.add(nums[i]);
                findSequences(nums, i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}