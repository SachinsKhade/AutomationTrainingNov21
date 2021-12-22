package com.collection;

import java.util.Hashtable;

public class HashTable {
public void hashTable()
{
		// Create a Hashtable object.	
		  Hashtable<Integer, String> objhashTable = new Hashtable<Integer, String>();
		  
		// Checking hashtable is empty or not.
		   boolean isEmpty = objhashTable.isEmpty();
		   System.out.println("Is hash table empty: " +isEmpty);

		// Adding entries using put() method in hash table.
		   objhashTable.put(1, "One"); // ht.size() is 1.
		   objhashTable.put(2, "Two"); // ht.size() is 2.
		   objhashTable.put(3, "Three"); // ht.size() is 3.
		   objhashTable.put(4, "Four"); // ht.size() is 4.
		   objhashTable.put(5, "Five"); // ht.size() is 5.
		   objhashTable.put(6, "Six"); // ht.size() is 6.
		 
		System.out.println("Displaying entries in hash table: " +objhashTable);
		int size = objhashTable.size();
		System.out.println("Size of hash table: " +size);

		// Removing last entry.
		  String removeE = objhashTable.remove(6);
		  System.out.println("Removed entry: " +removeE);
		  System.out.println("Updated entries in hash table: " +objhashTable);
		  
		// Getting the value of 4.
		   String getValue = objhashTable.get(4);
		   
		   System.out.println("Getting the value of 4: " +getValue);
		   System.out.println("Getting the value of 2: " +objhashTable.get(2));
		  }
		
}
