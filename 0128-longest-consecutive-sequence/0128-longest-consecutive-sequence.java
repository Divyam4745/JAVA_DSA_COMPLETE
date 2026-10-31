import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // 1. Edge case handling
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 2. Pre-allocate capacity to prevent rehashing overhead
        Set<Integer> set = new HashSet<>(nums.length);

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        int maxPossible = set.size() / 2; // For early termination

        for (int num : set) {
            // Start counting only from the beginning of a sequence
            if (!set.contains(num - 1)) {
                int count = 1;

                // Check for consecutive numbers
                while (set.contains(num + count)) {
                    count++;
                }

                longest = Math.max(longest, count);
                
                // 3. Early termination: 
                // If the longest sequence is greater than half the unique elements, 
                // there aren't enough remaining elements to beat it.
                if (longest > maxPossible) {
                    return longest;
                }
            }
        }

        return longest;
    }
}