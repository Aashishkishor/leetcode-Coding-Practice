class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        java.util.List<int[]> list = new java.util.ArrayList<>();
        int[] current = intervals[0];
        list.add(current);
        
        for (int i = 1; i < intervals.length; i++) {
            int currentBegin = current[0];
            int currentEnd = current[1];
            int nextBegin = intervals[i][0];
            int nextEnd = intervals[i][1];
            
            if (currentEnd >= nextBegin) {
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                current = intervals[i];
                list.add(current);
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}