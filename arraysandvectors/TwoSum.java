package com.datastructures.arraysandvectors;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] {2,3,7,4,8};
		int target = 7;
		int[] result = getTwoSum(numbers, target);
		System.out.println(result[0]+ " " + result[1]);
	}
	static int[] getTwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); int[] result = new int[2];
		for(int i=0; i<nums.length; i++) {
			int diff = target - nums[i];
			if(map.containsKey(diff)) {
				result[0] = i;
				result[1] = map.get(diff);
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
