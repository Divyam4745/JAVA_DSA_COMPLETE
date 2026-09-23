import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < n - 2; i++) {
            // 1. Skip duplicates for our fixed pointer 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = n - 1;
            
            // 2. Early Stopping (Min bound check for current 'i')
            // If the smallest possible sum for this 'i' is larger than target,
            // we can stop checking because the array is sorted and all future sums will be even larger.
            int minSum = nums[i] + nums[left] + nums[left + 1];
            if (minSum > target) {
                if (Math.abs(minSum - target) < Math.abs(closestSum - target)) {
                    closestSum = minSum;
                }
                break; // Break the outer loop entirely
            }
            
            // 3. Early Skipping (Max bound check for current 'i')
            // If the largest possible sum for this 'i' is smaller than target,
            // we can just update the closest sum and move to the next 'i'.
            int maxSum = nums[i] + nums[right] + nums[right - 1];
            if (maxSum < target) {
                if (Math.abs(maxSum - target) < Math.abs(closestSum - target)) {
                    closestSum = maxSum;
                }
                continue; // Skip the while loop and increment 'i'
            }
            
            // Standard two-pointer approach
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if (currentSum == target) {
                    return currentSum; // Found exact match
                }
                
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                if (currentSum < target) {
                    // 4. Skip duplicates for 'left'
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                } else {
                    // 5. Skip duplicates for 'right'
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                }
            }
        }
        
        return closestSum;
    }
}