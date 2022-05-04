package com.datastructures.arraysandvectors;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}

	static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size()==nums.length)
        	return false;
        return true;
    }
}
