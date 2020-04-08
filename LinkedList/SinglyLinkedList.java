package com.indra.ads.linkedlist;

public class SinglyLinkedList<T> {

	public class Node {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node headNode; // head node of linked list
	public int size; // size of linked list

	public SinglyLinkedList() {
		headNode = null;
		size = 0;
	}

	// helper function to check if list is empty or not

	public boolean isEmpty() {
		if (headNode == null)
			return true;
		return false;
	}

	// helper function to print list

	public void printList() {
		Node printNode = headNode;
		if(isEmpty()){
			System.out.println("List is empty");
			return;
		}
		System.out.print("List : ");
		while(printNode.next != null){
			System.out.print(printNode.data.toString() + "- > ");
			printNode = printNode.next;
		}
		System.out.println(printNode.data.toString() + " - > null ");
		
		
	}

	// function to add element at head of list

	public void insertAtHead(T data) {
		Node newNode = new Node(data);
		newNode.next = headNode;
		headNode = newNode;
		size++;
	}
	
	//function to add element at end of list
	
	public void insertAtEnd(T data){
		
		Node dummyhead = headNode;
		Node newNode = new Node(data);
		
		if(isEmpty()){
			newNode.next = headNode;
			headNode = newNode;
			return;
		}
		while(dummyhead.next != null){
			dummyhead = dummyhead.next;
		}
		dummyhead.next = newNode;
		size++;
	}
	
	//function to insert after a given value
	
	public void insertAfter (T data, T previous){
		Node newNode = new Node(data);
		Node currentNode = headNode;
		while(currentNode!= null){
			if(currentNode.data.equals(previous)){
				newNode.next = currentNode.next;
				currentNode.next = newNode;
			}
			currentNode = currentNode.next;
		}
		size++;
	}
	
	//function to search element in list
	
	public boolean isThere(T data){
		Node searchNode = headNode;
		while(searchNode != null){
			if(searchNode.data.equals(data)){
				return true;
			}
			searchNode = searchNode.next;
		}
		return false;
	}
	
	// function to delete head element in the list
	
	public void deleteHeadElement(){
		if(isEmpty()){
			return;
		}
		headNode = headNode.next;
		size--;
	}
	
	// function to delete value in the list
	
	public void deleteValueInList(T data){
		Node previous = null;
		Node current = this.headNode;
		if(isEmpty()){
			return;
		}
		// if the value to be deleted is headNode
		
		if(current.data.equals(data)){
			deleteHeadElement();
		}
		
		// delete other than head
		while(current != null){
			if(data.equals(current.data)){
				previous.next = current.next;
			}
			previous = current;
			current = current.next;
		}
		size--;
		
	}

	public static void main(String[] args) {

		SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
		for (int i = 1; i <= 5; i++) {
			llist.insertAtHead(i);
			llist.printList();
		}
		for(int i = 6; i <= 10; i++){
			llist.insertAtEnd(i);
			llist.printList();
		}
		llist.insertAfter(100, 7);
		llist.printList();
		System.out.println("List size is " + llist.size);
		System.out.println(llist.isThere(11));
		llist.deleteHeadElement();
		llist.printList();
		llist.deleteValueInList(7);
		llist.printList();
		System.out.println("List size is " + llist.size);
	}

}

/* o/p:

List : 1 - > null 
List : 2- > 1 - > null 
List : 3- > 2- > 1 - > null 
List : 4- > 3- > 2- > 1 - > null 
List : 5- > 4- > 3- > 2- > 1 - > null 
List : 5- > 4- > 3- > 2- > 1- > 6 - > null 
List : 5- > 4- > 3- > 2- > 1- > 6- > 7 - > null 
List : 5- > 4- > 3- > 2- > 1- > 6- > 7- > 8 - > null 
List : 5- > 4- > 3- > 2- > 1- > 6- > 7- > 8- > 9 - > null 
List : 5- > 4- > 3- > 2- > 1- > 6- > 7- > 8- > 9- > 10 - > null 
List : 5- > 4- > 3- > 2- > 1- > 6- > 7- > 100- > 8- > 9- > 10 - > null 
List size is 11
false
List : 4- > 3- > 2- > 1- > 6- > 7- > 100- > 8- > 9- > 10 - > null 
List : 4- > 3- > 2- > 1- > 6- > 100- > 8- > 9- > 10 - > null 
List size is 9
*/
