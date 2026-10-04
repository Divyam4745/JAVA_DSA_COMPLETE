class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { 
                // c == '*'
                // '*' can be ')', reducing minimum open parens
                minOpen--; 
                // '*' can be '(', increasing maximum open parens
                maxOpen++; 
            }
            
            // If maxOpen becomes negative, there are too many ')' to ever match
            if (maxOpen < 0) {
                return false;
            }
            
            // minOpen can't be negative. If it drops below 0, it just means 
            // we assumed a '*' was a ')', but we can just treat it as "" instead.
            minOpen = Math.max(minOpen, 0);
        }
        
        // If minOpen is 0 at the end, all '(' were successfully matched
        return minOpen == 0;
    }
}