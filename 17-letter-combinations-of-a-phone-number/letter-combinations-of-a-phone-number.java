import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        
        if (digits.isEmpty()) {
            return ans;
        }
                String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            ans.add("");
            for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) {
                String head = ans.remove();
                for (char letter : mapping[digit].toCharArray()) {
                    ans.add(head + letter);
                }
            }
        }
        
        return ans;
    }
}
