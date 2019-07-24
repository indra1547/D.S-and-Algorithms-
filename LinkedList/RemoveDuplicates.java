package com.indra.java.DataStructuresInJava.LinkedList;
import java.util.*;

public class RemoveDups {
	public String removeDups(LinkedList list){
		Node current = list.head;
		Node prev = list.head;
		Set<Integer> visitedNodes = new HashSet<Integer>();
		// list should not be empty and it should have more than one element
		if(!list.isEmpty() && current.next != null){
			while(current != null){
				// if current node is duplicate, connect previous to current
				//next node.
				if(visitedNodes.contains(current.data)){
					prev.next = current.next;
					current = current.next;
				}else{
					visitedNodes.add(current.data);
					prev = current;
					current = current.next;
				}
			}
		}
		return elements(list);
		
	}
	public String elements(LinkedList list){
		String stringElements = "";
		Node temp = list.head;
		while(temp != null){
			stringElements += temp.data;
			stringElements += "->";
			temp = temp.next;
		}
		stringElements += null;
		return stringElements;
	}

	public static void main(String[] args) {
		RemoveDups obj = new RemoveDups();
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 5);
		list.insertAtEnd(list, 2);
		System.out.println("Duplicate List : ");
		System.out.println(list.print());
		obj.removeDups(list);
		System.out.println("List without duplicates");
		list.print();
	}

}
