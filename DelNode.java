package com.indra.java.LinkedList;

/* Simple program to store 1 to 50 numbers in LinkedList 
 * and deleting node of a given number 
 */
public class DelNode {
	Node head;

	/* Method to Insert data */
	public void insertData(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	/* Method to print elements in Linked List */
	public void printElements() {
		/* Temporary Node */
		Node testNode = head;
		while (testNode != null) {
			System.out.println(testNode.data);
			testNode = testNode.next;
		}

	}

	/* Deleting node at given position */
	public void deleteNode(int pos) {
		// if list is empty
		if (head == null)
			return;
		Node tempNode = head;
		// deleting node at beginning
		if (pos == 0) {
			head = tempNode.next;
			return;
		}
		// exiting the method if position is more than nodes
		if (tempNode == null || tempNode.next == null)
			return;
		for (int i = 1; tempNode != null && i < pos - 1; i++)
			tempNode = tempNode.next;
		Node next = tempNode.next.next;
		tempNode.next = next;
	}

	public static void main(String[] args) {
		DelNode list = new DelNode();
		for (int i = 50; i > 0; i--) {
			list.insertData(i);
		}
		System.out.println("Print elements in the list");
		list.printElements();
		list.deleteNode(47);
		System.out.println("Print list after deleting node");
		list.printElements();

	}
}
