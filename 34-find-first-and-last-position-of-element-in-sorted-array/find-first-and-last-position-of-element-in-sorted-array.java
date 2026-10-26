class Solution {
    public int[] searchRange(int[] nums, int target) {
int[] result = {-1, -1};
result[0] = findFirst(nums, target);
 if (result[0] == -1) {   
 return result;
        }
result[1] = findLast(nums, target);
        return result;
    }
 private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstPos = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                firstPos = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstPos;
    }
    
    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastPos = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                lastPos = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
return lastPos;
    
        
    }
}