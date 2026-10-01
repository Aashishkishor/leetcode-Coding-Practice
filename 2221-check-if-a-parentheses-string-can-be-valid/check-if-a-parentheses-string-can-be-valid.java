class Solution {
    public boolean canBeValid(String s, String locked) {

        int n = s.length();
        
        if (n % 2 != 0) {
            return false;
        }
        
        int openBalance = 0;
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0' || s.charAt(i) == '(') {
                openBalance++;
            } else { 
                openBalance--;
            }
            
            if (openBalance < 0) {
                return false;
            }
        }
        
        int closeBalance = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0' || s.charAt(i) == ')') {
                closeBalance++;
            } else { 
                closeBalance--;
            }
            
            if (closeBalance < 0) {
                return false;
            }
        }
        
        return true;
        
    }
}