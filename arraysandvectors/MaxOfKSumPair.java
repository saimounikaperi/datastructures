package com.datastructures.arraysandvectors;
import java.util.*;

public class MaxOfKSumPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int N = sc.nextInt();
		System.out.println("Enter the elements");
		Vector<Integer> vector = new Vector<Integer>();
		for(int i=0; i<N; i++)
			vector.add(sc.nextInt());
		System.out.println("Enter the Key");
		int Key = sc.nextInt();
		System.out.println(maxOperations(vector, Key));
		sc.close();
	}
	static int maxOperations(Vector<Integer> vector, int key) {
		int res = 0;
	    Map<Integer, Integer> map = new HashMap<>();
	    for(int n : vector){
	        if(map.containsKey(key - n)){
	            map.put(key - n, map.get(key-n) - 1);
	            if(map.get(key - n) == 0)
	                map.remove(key - n);
	            res++;
	        }else {
	            map.put(n, map.getOrDefault(n, 0) + 1);
	        }
	    }
	    return res;
	}
}
