
import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff <= 0 || valueDiff < 0) {
            return false;
        }

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long current = nums[i];

            // Find the smallest number >= current - valueDiff
            Long candidate = set.ceiling(current - valueDiff);

            // Check whether a valid number exists
            if (candidate != null && candidate <= current + valueDiff) {
                return true;
            }

            set.add(current);

            // Maintain a window of at most indexDiff previous elements
            if (set.size() > indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}
