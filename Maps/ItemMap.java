package com.indra.java.maps;

/*A sample map to store ten objects, print map and get size of map*/

import java.util.HashMap;
import java.util.Map;

public class ItemMap {

	public static void main(String[] args) {
		/*Creating map of items*/
		HashMap<Integer, Item> map = new HashMap<Integer, Item>();
		Item i1 = new Item(1, "smartPhoneCase", 12.99);
		Item i2 = new Item(2, "Charger", 22.99);
		Item i3 = new Item(3, "Earphones", 102.99);
		Item i4 = new Item(4, "Harddisk", 122);
		Item i5 = new Item(5, "ipod", 222.19);
		Item i6 = new Item(6, "cables", 18.89);
		Item i7 = new Item(7, "Wireless mouse", 35.99);
		Item i8 = new Item(8, "Tracking pad", 89.99);
		Item i9 = new Item(9, "Keyboard", 49.99);
		Item i10 = new Item(10, "pendrive", 62.99);
	  /*Adding items to map*/
		map.put(1, i1);
		map.put(2, i2);
		map.put(3, i3);
		map.put(4, i4);
		map.put(5, i5);
		map.put(6, i7);
		map.put(7, i7);
		map.put(8, i8);
		map.put(9, i9);
		map.put(10, i10);
		/*Traversing map*/
		for(Map.Entry<Integer,Item> entry :map.entrySet()){
			int key = entry.getKey();
			Item i = entry.getValue();
			System.out.println(i.itemId + " "+ i.itemName + " " + i.itemPrice);
		}
		
		System.out.println("Size of Item Map " + map.size());
		
	}

}
