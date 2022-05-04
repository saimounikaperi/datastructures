package com.datastructures.arraysandvectors;

import java.util.Arrays;
import java.util.Vector;

public class Triplets {

	public static void main(String[] args) {
		//Given an array containing N integers, and an number S denoting a target Sum. 
		// Find all distinct integers that can add up to form target sum
		// The numbers in each triplet should be ordered too. Return empty array if no such triplet exists
		// arr[] = [1,2,3,4,5,6,7,8,9,15]
		// target = 18
		// Output [[1,2,15],[3,7,8],[4,6,8],[5,6,7]]
		int[] arr = { 1,3,2,4,6,7,5,9,8,0 };
		int target = 18;
		Vector<Vector<Integer>> vector = triplets(arr, target);
		for(Vector<Integer> i: vector) {
			System.out.print("[");
			for(Integer j: i) {
				System.out.print(j + " ");
			}
			System.out.println("]");
		}
	}
	static Vector<Vector<Integer>> triplets(int arr[], int sum) {
		Arrays.sort(arr);
		Vector<Vector<Integer>> vector = new Vector<Vector<Integer>>();
		for(int i=0; i<arr.length - 3; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while(j < k) {
				int currentSum = arr[i];
				currentSum += arr[j];
				currentSum += arr[k];
				if(currentSum == sum) {
					Vector<Integer> v = new Vector<Integer>();
					v.add(arr[i]);
					v.add(arr[j]);
					v.add(arr[k]);
					vector.add(v);
					j++; k--;
				} else if(currentSum > sum) {
					k--;
				} else {
					j++;
				}
			}
		}
		return vector;
	}
}
