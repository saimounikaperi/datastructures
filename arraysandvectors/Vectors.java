package com.datastructures.arraysandvectors;

import java.util.*;

public class Vectors {

	public static void main(String[] args) {
		
		//Create a Vector with integers as Vector Type
		Vector<Integer> vector = new Vector<Integer>();
		
		System.out.println("Size of Vector " + vector.size()); // Result is Empty Array - size is 0
		System.out.println("Capacity of vector " + vector.capacity()); // Returns Capacity of Vector
		
		vector.add(1);vector.add(2);vector.add(3);vector.add(4);
		vector.add(1);vector.add(2);vector.add(3);vector.add(4);
		vector.add(1);vector.add(2); vector.add(3); //O(1) for each add
		
		System.out.println("Size of Vector " + vector.size()); // Result is Empty Array - size is 4
		System.out.println("Capacity of vector " + vector.capacity()); // Returns Capacity of Vector
		
		vector.forEach(System.out::println); //Print each element of vector
		
		//2D Vector
		Vector<Vector<Integer>> vector2D = new Vector<Vector<Integer>>();
		vector2D.add(vector);
		System.out.println("2D Vector");
		vector2D.forEach(System.out::println);
		
		
	}

}
