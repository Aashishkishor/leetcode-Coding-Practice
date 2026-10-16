class Solution {
    public int maximumTastiness(int[] price, int k) {
           Arrays.sort(price);
        
        int n = price.length;
        int left = 0;
        int right = price[n - 1] - price[0];
        int maxTastiness = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canPick(price, k, mid)) {
                maxTastiness = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return maxTastiness;
    }
    
    private boolean canPick(int[] price, int k, int targetDiff) {
        int count = 1;
        int lastPicked = price[0];
        
        for (int i = 1; i < price.length; i++) {
            if (price[i] - lastPicked >= targetDiff) {
                count++;
                lastPicked = price[i];
                if (count == k) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
        
