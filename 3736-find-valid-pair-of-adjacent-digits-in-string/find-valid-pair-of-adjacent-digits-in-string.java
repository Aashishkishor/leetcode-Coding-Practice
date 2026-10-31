class Solution {
    public String findValidPair(String s) {
        
        int[] count = new int[10];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - '0']++;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);

            if (first != second) {
                int d1 = first - '0';
                int d2 = second - '0';

                if (count[d1] == d1 && count[d2] == d2) {
                    return "" + first + second;
                }
            }
        }

        return "";
    }
}