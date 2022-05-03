package com.datastructures.arraysandvectors;
import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		
		TreeMap<String, ArrayList<String>> phoneBook = new TreeMap<String, ArrayList<String>>();
		//Insert elements - O(LogN)
		phoneBook.put("Mounika", new ArrayList<String>());
		phoneBook.get("Mounika").add("111111111");
		phoneBook.get("Mounika").add("222222222");
		phoneBook.put("Jyothi", new ArrayList<String>());
		phoneBook.get("Jyothi").add("111111111");
		phoneBook.get("Jyothi").add("222222222");
		
		//Try to make a phonebook and print it...O(N)
		for(Map.Entry<String, ArrayList<String>> e : phoneBook.entrySet())
			System.out.println(e.getKey() + " : " + e.getValue());
	}

}
