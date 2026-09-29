class Solution {
    public boolean canCross(int[] stones) {

        int n = stones.length;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }
        
        map.get(stones[0]).add(1);
        
        for (int i = 0; i < n; i++) {
            int stone = stones[i];
            
            for (int jump : map.get(stone)) {
                int nextPos = stone + jump;
                
                if (nextPos == stones[n - 1]) {
                    return true;
                }
                
                if (map.containsKey(nextPos)) {
                    if (jump - 1 > 0) {
                        map.get(nextPos).add(jump - 1);
                    }
                    map.get(nextPos).add(jump);
                    map.get(nextPos).add(jump + 1);
                }
            }
        }
        
        return false;
    }
}