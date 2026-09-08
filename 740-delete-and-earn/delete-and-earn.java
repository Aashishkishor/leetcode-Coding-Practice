
import java.util.*;

class Solution {

    int[] dp = new int[20005];

    int fun(int i, int[] nums, HashMap<Integer, Integer> map) {

        if (i == nums.length - 1) {
            return nums[i] * map.get(nums[i]);
        }

        if (i >= nums.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int max = 0;

        if (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
            int take = (nums[i] * map.get(nums[i])) + fun(i + 2, nums, map);
            max = Math.max(max, take);
        }

        if (i + 1 < nums.length && nums[i + 1] != nums[i] + 1) {
            int take = (nums[i] * map.get(nums[i])) + fun(i + 1, nums, map);
            max = Math.max(max, take);
        }

        int skip = fun(i + 1, nums, map);
        max = Math.max(max, skip);

        return dp[i] = max;
    }

    public int deleteAndEarn(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int[] values = new int[map.size()];
        int index = 0;

        for (int x : map.keySet()) {
            values[index++] = x;
        }

        Arrays.sort(values);

        Arrays.fill(dp, -1);

        return fun(0, values, map);
    }
}