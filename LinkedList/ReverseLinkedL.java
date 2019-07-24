package com.indra.java.DataStructuresInJava.LinkedList;

public class ReverseLinkedList {
	public String reverse(LinkedList list){
		Node prev = null;
		Node current = list.head;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		list.head = prev;
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
		LinkedList list = new LinkedList();
		ReverseLinkedList obj = new ReverseLinkedList();
		for(int i = 0; i <=5; i++){
			list.insertAtEnd(list, i);
		}
		obj.reverse(list);
		list.print();
	}

}
