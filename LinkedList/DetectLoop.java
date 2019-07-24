package com.indra.java.DataStructuresInJava.LinkedList;

import java.util.*;

public class DetectLoop {
	// following solution is using flyod's cycle detection algorithm
	public boolean detectLoop(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public boolean detectLoopUsingHashSet(LinkedList list) {
		Set<Node> visitedNodes = new HashSet<Node>();
		Node current = list.head;
		while (current != null) {
			if (visitedNodes.contains(current)) {
				return true;
			}
			visitedNodes.add(current);
			current = current.next;
		}
		return false;
	}

	// helper function to create loop
	public void insertLoop(LinkedList list) {
		Node currentNode = list.head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = list.head;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		DetectLoop obj = new DetectLoop();
		for (int i = 0; i <= 5; i++) {
			list.insertAtEnd(list, i);
		}
		obj.insertLoop(list);
		if (obj.detectLoopUsingHashSet(list)) {
			System.out.println("Loop found");
		} else {
			System.out.println("Loop not found");
		}
	}

}
