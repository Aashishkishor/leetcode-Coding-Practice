import java.util.*;

class Solution {

    long[] dp = new long[100003];

    long fun(int i, int[] nums, HashMap<Integer, Integer> map) {

        if (i >= nums.length) {
            return 0;
        }

        int id = nums.length;

        if (dp[i] != -1) {
            return dp[i];
        }

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] > nums[i] + 2) {
                id = j;
                break;
            }
        }

        long take = (long) nums[i] * map.get(nums[i])
                + fun(id, nums, map);

        long notTake = fun(i + 1, nums, map);

        return dp[i] = Math.max(take, notTake);
    }

    public long maximumTotalDamage(int[] nums) {

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