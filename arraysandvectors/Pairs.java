package com.datastructures.arraysandvectors;

import java.util.*;

public class Pairs {

	public static void main(String[] args) {
		/*
		 * Given an array of N integers and a number S denoting a target Sum
		 * Let us assume there will be only one such pair. 
		 * Find two distinct integers that can pair up to form target sum. Let us assume there will be only one such pair
		 * Input: arr =[10,5,2,3,-6,9,11]
		 * S=4
		 * Output= [10,-6]
		 */

		/*First approach - Brute Force Approach
		 * Take first number and try to pair with all the remaining numbers -O(N2)
		 * 
		 * Second Approach- Do a Sort and then do a binary search
		 * lets assume -6 + x = 4 ==> 10
		 * Sorting will take O(NlogN) time and search is O(NLogN) time --> O(NlogN)
		 * 
		 * Third Approach- Optimized
		 * Put in HashSet - Hashset does the search in O(1) time --> Using this property we do in O(N) time
		 */
		
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vector = new Vector<Integer>();
		System.out.println("Enter the size of an array..");
		int n = sc.nextInt();
		System.out.println("Enter the elements of an array..");
		for(int i =0; i<n; i++)
			vector.add(sc.nextInt());
		System.out.println("Enter the key");
		int key = sc.nextInt();
		Vector<Integer> pair = pairSum(vector, key);
		if(pair.size()==0)
			System.out.println("No Such Pair..");
		else
			System.out.println(pair.get(0)+ "," + pair.get(1));
		sc.close();
	}
	static Vector<Integer> pairSum(Vector<Integer> vector, int Key) {
		Set<Integer> set = new HashSet<Integer>();
		Vector<Integer> result = new Vector<Integer>();
		for(int i=0; i<vector.size(); i++) {
			int x = Key - vector.get(i);
			if(set.contains(x)) {
				result.add(x);
				result.add(vector.get(i));
			}
			set.add(vector.get(i));
		}
		return result;
	}
}
