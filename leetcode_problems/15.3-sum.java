/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length-1; i++) {
            for(int j =i+1; j<nums.length-1; j++) {
                for(int k =j+1; k<nums.length-1; k++) {
                    int num1 = nums[i];
                    int num2 = nums[j];
                    int num3 = nums[k];
                    if (num1+num2+num3 == 0) {
                        System.out.println(num1 + num2 + num3);
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        
                    }
                    
                    
                }
            }
        }
        return result;
    }
}
// @lc code=end

