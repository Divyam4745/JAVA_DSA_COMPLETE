class Solution {
    public boolean isValid(String s) {
        // Early exit: an odd-length string can never be perfectly matched
        if (s.length() % 2 != 0) {
            return false;
        }

        // Use a primitive array as a stack for maximum performance
        char[] stack = new char[s.length()];
        int top = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Push the *expected* closing bracket
            if (ch == '(') {
                stack[top++] = ')';
            } else if (ch == '{') {
                stack[top++] = '}';
            } else if (ch == '[') {
                stack[top++] = ']';
            } else {
                // If the stack is empty or the popped character doesn't match
                if (top == 0 || stack[--top] != ch) {
                    return false;
                }
            }
        }
        
        // If top is 0, all brackets were matched and popped
        return top == 0;
    }
}