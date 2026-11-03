package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question_4 {

    static boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // agar stack empty ho tb
                if (st.isEmpty()) {
                    return false;
                }
// 1 case hmm solve krenge bakki recursion samal lega
                if (ch == ')' && st.peek() != '(') {
                    return false;
                }
                if (ch == '}' && st.peek() != '{') {
                    return false;
                }
                if (ch == ']' && st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {

        String s = "{[()]}";

        if (isValid(s)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}