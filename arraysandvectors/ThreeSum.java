package com.datastructures.arraysandvectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// FGiven an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
		//Notice that the solution set must not contain duplicate triplets.
		int[] arr = {0};
		List<List<Integer>> vector = threeSum(arr);
		for(List<Integer> i: vector) {
			System.out.print("[");
			for(Integer j: i) {
				System.out.print(j + " ");
			}
			System.out.println("]");
		}
	}
	public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int j = i + 1;
            int k = arr.length - 1;
            int currentSum = 0;
            if(i>0 && arr[i] == arr[i-1])
            	continue;
            while(j < k){
            	if(k<arr.length-1 && arr[k] == arr[k+1]) {
            		k--;
            		continue;
            	}
                currentSum = arr[i] + arr[j] + arr[k];
                if(currentSum == 0){
                    List<Integer> value = Arrays.asList(arr[i], arr[j], arr[k]);
                    result.add(value);
                    j++; k--;
                }else if(currentSum > 0)
                    k--;
                else
                    j++;
            }
        }
        return result;
    }

}
