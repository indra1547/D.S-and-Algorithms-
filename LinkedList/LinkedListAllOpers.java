package com.indra.java.DataStructuresInJava.LinkedList;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	Node head;
	
	LinkedList(){
		head = null;
	}

	private void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println(data + " Inserted !");
	}
	private String insertAtEnd(LinkedList list , int data){
		Node newNode = new Node(data);
		Node currentNode = list.head;
		if(currentNode == null){
			list.head = newNode;
			return elements(list);
		}
		while(currentNode.next != null){
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		return elements(list);
	}
	
	private String insertAfter(LinkedList list, int data, int previous){
		Node newNode = new Node(data);
		Node currentNode = list.head;
		if(currentNode == null){
			list.head = newNode;
			return elements(list);
		}
		while(currentNode.data != previous){
			currentNode = currentNode.next;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
		return elements(list);
	}

	// this helper function converts list of elements to single string
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

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean print() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		Node temp = head;
		System.out.print("List : ");
		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data + "->null");
		return true;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList list1 = new LinkedList();
		list.print();
		for(int i = 0; i<=10; i++){
			list.insertAtHead(i);
			list.print();
		}
		System.out.println("*********************InsertAtEnd***********************");
		for(int i = 11; i<=15; i++){
			list1.insertAtEnd(list1, i);
			list1.print();
		}
		System.out.println("*********************InsertAfter***********************");
		list1.insertAfter(list1, 18, 13);
		list1.print();
		
		
	}

}
