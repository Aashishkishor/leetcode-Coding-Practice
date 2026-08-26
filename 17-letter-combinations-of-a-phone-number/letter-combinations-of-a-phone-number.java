class Solution {
    public List<String> letterCombinations(String digits) {
List<String> ans = new ArrayList<>();
if (digits.length() == 0) {
 return ans;
        }
 String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };ans.add("");
for (char digit : digits.toCharArray()) {
String letters = map[digit - '0'];
List<String> k= new ArrayList<>();
    for (String s : ans) {
                for (char ch : letters.toCharArray()) {
                    k.add(s + ch);
                }} ans = k;
        }return ans;
    }
}
        
    
