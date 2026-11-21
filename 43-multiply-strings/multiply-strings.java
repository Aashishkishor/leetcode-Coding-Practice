class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String total = "0";
        int shift = 0;

        for (int i = num2.length() - 1; i >= 0; i--) {
            int d2 = num2.charAt(i) - '0';
            int carry = 0;
            StringBuilder partial = new StringBuilder();

            for (int j = num1.length() - 1; j >= 0; j--) {
                int d1 = num1.charAt(j) - '0';
                int prod = d1 * d2 + carry;
                partial.append(prod % 10);
                carry = prod / 10;
            }

            if (carry > 0) {
                partial.append(carry);
            }

            partial.reverse();

            for (int k = 0; k < shift; k++) {
                partial.append('0');
            }

            total = addStrings(total, partial.toString());
            shift++;
        }

        return total;
    }

    private String addStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
        
    }
}