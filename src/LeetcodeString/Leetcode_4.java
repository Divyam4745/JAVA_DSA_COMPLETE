package LeetcodeString;

public class Leetcode_4 {
    static String removeDuplicate(String s){
        if (s == null || s.length() == 0) return "";
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ch) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicate(s));
    }
}
