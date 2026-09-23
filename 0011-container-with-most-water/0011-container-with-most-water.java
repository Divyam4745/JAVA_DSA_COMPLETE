class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int hLeft = height[left];
            int hRight = height[right];
            
            // If the left line is shorter, calculate area and move left pointer
            if (hLeft < hRight) {
                int area = hLeft * (right - left);
                if (area > maxArea) {
                    maxArea = area;
                }
                // Skip all subsequent lines that are shorter or equal to hLeft
                while (left < right && height[left] <= hLeft) {
                    left++;
                }
            } 
            // If the right line is shorter (or equal), calculate area and move right pointer
            else {
                int area = hRight * (right - left);
                if (area > maxArea) {
                    maxArea = area;
                }
                // Skip all subsequent lines that are shorter or equal to hRight
                while (left < right && height[right] <= hRight) {
                    right--;
                }
            }
        }

        return maxArea;
    }
}