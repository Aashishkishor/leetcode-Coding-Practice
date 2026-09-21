class Solution {
    public long countIntersectingIntervals(int[][] intervals) { 

int[][] temoravlin = intervals;
        
        Arrays.sort(temoravlin, (a, b) -> Integer.compare(a[0], b[0]));
        
        long count = 0;
        int n = temoravlin.length;
        
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            int matchIndex = i;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (temoravlin[mid][0] <= temoravlin[i][1]) {
                    matchIndex = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            count += (matchIndex - i);
        }
        
        return count;












































        
    }
}