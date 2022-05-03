package com.datastructures.arraysandvectors;

import java.util.*;

public class KDiffPairs {

	public static void main(String[] args) {
		/*
		 * Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
		 * A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
		 * Input: nums = [1,2,3,4,5], k = 1
		 * Output: 4
		 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
		 */
		
		Scanner sc = new Scanner(System.in);
		int arr[]= {0} ;
		System.out.println("Enter the size of an array..");
		int n = sc.nextInt();
		System.out.println("Enter the elements of an array..");
		for(int i =0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the key");
		int key = sc.nextInt();
		System.out.println(findPairs(arr, key));
		sc.close();
	}

	public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
            int count =0;
            for(int each:nums){
                if(map.containsKey(each)){
                   if(k>0)
                       continue;
                    if(map.get(each)==1)
                        count++;
                }else{
                    if(map.containsKey(each-k))
                        count++;
                    if(map.containsKey(each+k))
                        count++;  
                    }
                map.put(each, map.getOrDefault(each,0)+1);
        }
        return count;
    }
}