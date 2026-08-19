import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> currentSubset, int[] nums, int start) {
        result.add(new ArrayList<>(currentSubset));
        
        for (int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            backtrack(result, currentSubset, nums, i + 1);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}