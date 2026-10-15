
class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        if (n % 2 != 0) return false;

        char[] stack = new char[n];
        int top = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack[top++] = ')';
            } else if (ch == '{') {
                stack[top++] = '}';
            } else if (ch == '[') {
                stack[top++] = ']';
            } else {
                if (top == 0 || stack[--top] != ch) {
                    return false;
                }
            }
        }

        return top == 0;
    }
}
