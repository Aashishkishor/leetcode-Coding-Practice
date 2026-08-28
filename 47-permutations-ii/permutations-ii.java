class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, new boolean[nums.length], new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] nums, boolean[] k, List<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (k[i] || (i > 0 && nums[i] == nums[i - 1] && !k[i - 1])) continue;
            k[i] = true;
            path.add(nums[i]);
            dfs(nums, k, path, res);
            k[i] = false;
            path.remove(path.size() - 1);
        }
    
}

        
    }
