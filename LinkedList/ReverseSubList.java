package com.indra.CodingPatterns.InPlaceReversalLinkedList;

public class ReverseSubList {
	public Node reverseSubList(Node head, int p, int q) {
		if (p == q) {
			return head;
		}
		// skip p-1 nodes, current will point to pth node
		Node current = head;
		Node previous = null;
		for (int i = 0; current != null && i < p - 1; i++) {
			previous = current;
			current = current.next;
		}
		/*
		 * we are interested in three parts of the LinkedList, part before index
		 * 'p', part between 'p' and 'q', and the part after index 'q'
		 */
		Node lastNodeOfFirstPart = previous; // points to the node at index 'p-1
		Node lastNodeOfSubList = current;
		Node next = null; // to store temprorily next node
		// reverse node between p and q
		for (int i = 0; current != null && i < q - p + 1; i++) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		// connect with first part
		if (lastNodeOfFirstPart != null) {
			lastNodeOfFirstPart.next = previous; //previous' is now the first node of the sub-list
		} else { // changing head of linked list p=1
			head = previous;
		}
		// connect last part
		lastNodeOfSubList.next = current;
		return head;
	}

	public static void main(String[] args) {
		Node list = new Node(1);
		list.next = new Node(2);
		list.next.next = new Node(3);
		list.next.next.next = new Node(4);
		list.next.next.next.next = new Node(5);
		Node result = new ReverseSubList().reverseSubList(list, 2, 4);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}

}
