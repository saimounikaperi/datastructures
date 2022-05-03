package com.datastructures.arraysandvectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Count_Number_of_Pairs_With_Absolute_DifferenceK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
		 * Input: nums = [1,2,2,1], k = 1
		 * Output: 4
		 * Explanation: The pairs with an absolute difference of 1 are:
		 * - [1,2,2,1]
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,2,1};
		System.out.println("Enter the key");
		int key = sc.nextInt();
		System.out.println(countKDifference(arr, key));
		sc.close();

	}
	static int countKDifference(int[] nums, int k) {
		int pairs = 0;
        int i, n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(i = 0; i < n; i++){
            pairs += map.getOrDefault(nums[i] + k, 0);
            pairs += map.getOrDefault(nums[i] - k, 0);
            map.put(nums[i], 1 + map.getOrDefault(nums[i], 0));
        }
        return pairs;
	}
}
