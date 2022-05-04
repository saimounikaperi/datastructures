package com.datastructures.arraysandvectors;

import java.util.HashSet;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] arr = {3,4,-1,1};
		System.out.println(getMEX(arr));
	}
	public static int getMEX(int[] a) {
		  int n = a.length;
		  HashSet < Integer > hash = new HashSet < Integer > ();
		  for (int i = 0; i < n; i++) {
		    hash.add(a[i]);
		  }
		  for (int i = 1; i <= n + 1; i++) {
		    if (!hash.contains(i)) {
		      return i;
		    }
		  }
		  return -1;
		}
}
