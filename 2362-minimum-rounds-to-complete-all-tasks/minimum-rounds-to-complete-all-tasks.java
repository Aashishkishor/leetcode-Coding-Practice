class Solution {
    public int minimumRounds(int[] tasks) {
      
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int task : tasks) {
            count.put(task, count.getOrDefault(task, 0) + 1);
        }
        
        int rounds = 0;
        
        for (int freq : count.values()) {
            if (freq == 1) {
                return -1;
            }
            rounds += (freq + 2) / 3;
        }
        
        return rounds;


        
    }
}