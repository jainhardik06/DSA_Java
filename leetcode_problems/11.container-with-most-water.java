/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max_water = 0;
        while (left < right) {
            int wallheight = Math.min(height[left], height[right]);
            int base = right - left;
            int water = wallheight * base;
            if (max_water < water) {
                max_water = water;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_water;
    }
}
// @lc code=end

