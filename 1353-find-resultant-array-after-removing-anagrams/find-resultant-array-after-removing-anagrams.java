class Solution {
    public List<String> removeAnagrams(String[] words) {
        

        List<String> res = new ArrayList<>();
        String prev = "";
        
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String curr = new String(chars);
            
            if (!curr.equals(prev)) {
                res.add(word);
                prev = curr;
            }
        }
        
        return res;
        
    }
}