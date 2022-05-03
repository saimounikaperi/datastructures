package com.datastructures.arraysandvectors;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RestaurantMenuGenerator_HashTable {

	public static void main(String[] args) {
		
		Hashtable<String,Double> hashtable = new Hashtable<String, Double>();
		Scanner sc = new Scanner(System.in);
		//Insertion done at O(1) time
		hashtable.put("Maggie", 15.00);
		hashtable.put("Dosa", 99.00);
		hashtable.put("CoolDrink", 20.00);
		hashtable.put("Pizza", 250.00);
		hashtable.put("Burger", 100.00);
		hashtable.put("Poori", 45.00);
		hashtable.put("Idly", 40.00);
		hashtable.put("Idly", 45.00);
		
		//Update an item cost for a menu item in O(1) time
		hashtable.put("Dosa", (1 + 0.1)*hashtable.get("Dosa"));
		
		//Delete an item from the menu
		hashtable.remove("Dosa");
		
		//Iterate over all the key-value pairs inside a hashtable- Order is O(n) time- Its a Random Order not sorted
		System.out.println("Menu Items available today: ");
		for(Entry<String, Double> e : hashtable.entrySet())
			System.out.println(e.getKey() + " : " + e.getValue());
		
		//Search for an item is done at O(1) time
		System.out.println("Enter the item to be searched in Menu:");
		String item = sc.next();
		System.out.println(hashtable.containsKey(item) ? "Item is available and its cost is " + hashtable.get(item) : "Item is not available currently in Menu");
		
		sc.close();
	}
}
