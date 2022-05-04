package com.datastructures.arraysandvectors;

import java.util.Arrays;
import java.util.List;

public class ThreeSum_Closest {

	public static void main(String[] args) {
		 /* Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
		  * Return the sum of the three integers.
		  * You may assume that each input would have exactly one solution.
		  * Example 1:
		  * Input: nums = [-1,2,1,-4], target = 1
		  * Output: 2
		  * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
		  */
		int[] arr = {-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumClosest(arr, target));
	}
	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length - 1];
        int closestSum = sum;
        for(int i = 0; i < nums.length - 2; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int left = i + 1, right = nums.length - 1;
                while(left < right){
                    sum = nums[left] + nums[right] + nums[i];
                    if(sum < target){
                        while(left<right && nums[left] == nums[left+1]){
                            left++;
                        }
                        left++;
                    }else if(sum > target){
                        while(left<right && nums[right] == nums[right-1]){
                            right--;
                        }
                        right--;
                    }else{
                        return sum;
                    }
                    if(Math.abs(target -sum) < Math.abs(target - closestSum)){
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }
}
