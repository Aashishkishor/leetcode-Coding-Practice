class Solution {
    public int minOperations(String s) {
        int n = s.length();
     int minTotalOps = Integer.MAX_VALUE;
        
for (int r = 0; r < n; r++) {
     int currentOps = r; 
         int i = 0;
            int j = n - 1;
            
            while (i < j) {
            char chari = s.charAt((i + r) % n);
 char charj = s.charAt((j + r) % n);
                
                int diff = Math.abs(chari - charj);
                currentOps += Math.min(diff, 26 - diff);
                
                i++;
                j--;
            }
            
            minTotalOps = Math.min(minTotalOps, currentOps);
        }
        
        return minTotalOps;
    }
}