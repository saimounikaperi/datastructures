package com.datastructures.arraysandvectors;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class RestaurantMenuGenerator_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, Double> hashMap = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		
		//Insert elements into HashMap o(logN)
		hashMap.put("Maggie", 15.00);
		hashMap.put("Dosa", 99.00);
		hashMap.put("CoolDrink", 20.00);
		hashMap.put("Pizza", 250.00);
		hashMap.put("Burger", 100.00);
		hashMap.put("Poori", 45.00);
		hashMap.put("Idly", 40.00);
		
		//Update an item cost for a menu item in O(logN) time
		hashMap.put("Dosa", (1 + 0.1)*hashMap.get("Dosa"));
		
		//Delete an item from the menu o(logN)
		hashMap.remove("Dosa");
		
		//Iterate over all the key-value pairs inside a hashMap- Order is O(n) time- Its a Random Order not sorted
		System.out.println("Menu Items available today: ");
		for(Entry<String, Double> e : hashMap.entrySet())
			System.out.println(e.getKey() + " : " + e.getValue());
		
		//Search for an item is done at O(logN) times
		System.out.println("Enter the item to be searched in Menu:");
		String item = sc.next();
		System.out.println(hashMap.containsKey(item) ? "Item is available and its cost is " + hashMap.get(item) : "Item is not available currently in Menu");
		
		sc.close();

	}

}
