package com.datastructures.arraysandvectors;

import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		//Write a FizzBuzz function that returns a Vector<String> with the numbers 1 to n
		// For Multiples of 3 store "Fizz" instead of that number
		// For Multiples of 5 store "Buzz" instead of that number
		// For Numbers which are multiples of both 3 and 5 store FizzBuzz
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = sc.nextInt();
		System.out.println(fizzbuzz(n));
		sc.close();
	}
	static Vector<String> fizzbuzz(int n){
		Vector<String> vector = new Vector<String>();
		for(int i=0; i<n; i++) {
			if(i%3 ==0 && i%5 == 0)
				vector.add("FizzBuzz");
			else if(i%3 == 0)
				vector.add("Fizz");
			else if(i%5 == 0)
				vector.add("Buzz");
			else
				vector.add(String.valueOf(i));
		}
		return vector;
	}
}
