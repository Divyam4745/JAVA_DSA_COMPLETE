import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] left = new int[26];
        int[] right = new int[26];
        
        // Initialize arrays with -1
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);
        
        // Step 1: Record the first and last occurrence of each character
        for (int i = 0; i < n; i++) {
            int charIdx = s.charAt(i) - 'a';
            if (left[charIdx] == -1) {
                left[charIdx] = i;
            }
            right[charIdx] = i;
        }
        
        List<int[]> validIntervals = new ArrayList<>();
        
        // Step 2: Find all valid intervals
        for (int i = 0; i < 26; i++) {
            if (left[i] == -1) continue; // Character not in string
            
            int start = left[i];
            int end = right[i];
            int j = start;
            boolean isValid = true;
            
            // Try to validate the substring starting at 'start'
            while (j <= end) {
                int currChar = s.charAt(j) - 'a';
                
                // If a character inside our range started earlier than our 'start',
                // this candidate fails because it would force us to expand left.
                if (left[currChar] < start) {
                    isValid = false;
                    break;
                }
                
                // Expand the end boundary if this character's last occurrence is further
                end = Math.max(end, right[currChar]);
                j++;
            }
            
            if (isValid) {
                validIntervals.add(new int[]{start, end});
            }
        }
        
        // Step 3: Greedily pick the maximum number of non-overlapping intervals
        // Sort primarily by end time (ascending) to pick the smallest/innermost intervals first
        validIntervals.sort((a, b) -> Integer.compare(a[1], b[1]));
        
        List<String> result = new ArrayList<>();
        int lastEnd = -1;
        
        for (int[] interval : validIntervals) {
            if (interval[0] > lastEnd) {
                result.add(s.substring(interval[0], interval[1] + 1));
                lastEnd = interval[1];
            }
        }
        
        return result;
    }
}
