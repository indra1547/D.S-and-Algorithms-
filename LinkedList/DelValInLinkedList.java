package com.indra.java.DataStructuresInJava.LinkedList;

public class DelValueInLinkedList {
	Node head;
	public String delVal(LinkedList list, int val){
		head = list.head;
		// if list is empty
		if(list.isEmpty()){
			System.out.println("Empty list");
			return elements(list);
		}
		// if list is not empty
		Node currentNode = list.head;
		Node previous = null;
		// if list has only one element
		if(currentNode.data == val){
			this.deletionAtHead(list);
			return elements(list);
		}
		// if list has more than one element, need to traverse
		while(currentNode != null){
			if(currentNode.data == val){
				previous.next = currentNode.next;
			}
			previous = currentNode;
			currentNode = currentNode.next;
		}
		return elements(list);
		
	}
	public String deletionAtHead(LinkedList list){
		Node currentNode = list.head;
		if(currentNode != null){
			list.head = currentNode.next;
		}
		return elements(list);
	}
	private String elements(LinkedList list) {
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
		DelValueInLinkedList obj = new DelValueInLinkedList();
		for(int i =0; i<=10; i++){
			list.insertAtEnd(list, i);
		}
		obj.delVal(list, 8);
		list.print();
	}

}
