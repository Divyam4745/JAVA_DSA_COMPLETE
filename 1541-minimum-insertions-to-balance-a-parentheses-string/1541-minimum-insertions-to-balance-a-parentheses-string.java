class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // If the previous ')' is unmatched, insert another ')'
                if (open > 0 && i > 0 && s.charAt(i - 1) == ')') {
                    // handled by closing logic below
                }
                open++;
            } else {
                // Check whether this ')' has another ')' immediately after it
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; // consume the second ')'
                } else {
                    insertions++; // insert the missing ')'
                }

                if (open > 0) {
                    open--;
                } else {
                    insertions++; // insert a missing '('
                }
            }
        }

        return insertions + open * 2;
    }
}