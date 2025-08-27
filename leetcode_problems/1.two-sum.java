/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum, i, j;
        int arr [] =new int[2];
        for(i=0; i<nums.length; i++){
            for(j=i+1; j<nums.length; j++){
                sum = nums[i]+nums[j];
                if(sum==target){
                 arr[0]= i;
                 arr[1]= j;
                return arr;
                }
            }
        }
        return arr;
        

    }
}
// @lc code=end

