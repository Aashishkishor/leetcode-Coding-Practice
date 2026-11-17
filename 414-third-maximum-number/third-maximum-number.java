class Solution {
    public int thirdMax(int[] nums) {
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() < 3) {
            return set.last();
        }
        set.pollLast();
        set.pollLast();
        return set.last();

        
    }
}