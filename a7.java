class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                st.append(c);
            }
        }
        String filtered = st.toString();
        int i = 0, j = filtered.length() - 1;
        while (i <= j) {
            if (filtered.charAt(i) != filtered.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}