class Solution {
    public int countBinarySubstrings(String s) {
        int prevCount = 0;
        int currCount = 1;
        int total = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currCount++;
            } else {
                total += Math.min(prevCount, currCount);
                prevCount = currCount;
                currCount = 1;
            }
        }

        total += Math.min(prevCount, currCount);
        return total;
        
    }
}