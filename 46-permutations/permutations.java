class Solution {
    public List<List<Integer>> permute(int[] nums) {
List<List<Integer>> result = new ArrayList<>();
 result.add(new ArrayList<>());
for (int i = 0; i < nums.length; i++) {
List<List<Integer>> nextLevel = new ArrayList<>();
            
for (List<Integer> currentList : result) {
                for (int j = 0; j <= currentList.size(); j++) {
                    List<Integer> newList = new ArrayList<>(currentList);
     newList.add(j, nums[i]);
nextLevel.add(newList);
                }
            } result = nextLevel;
        } return result;
        
    }
}