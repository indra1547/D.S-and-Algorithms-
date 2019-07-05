package com.indra.CodingPatterns.InPlaceReversalLinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class ReverseLinkedList {
	Node head;

	public Node reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node next = null; // used to store temporirly next address
		Node current = head; // current node that will be processing
		Node previous = null; // previous node that we have processed
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		Node list = new Node(2);
		list.next = new Node(4);
		list.next.next = new Node(6);
		list.next.next.next = new Node(8);
		list.next.next.next.next = new Node(10);
		Node result = new ReverseLinkedList().reverse(list);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}

	}

}
