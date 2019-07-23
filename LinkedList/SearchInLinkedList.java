package com.indra.java.DataStructuresInJava.LinkedList;

public class SearchInLinkedList {
	public boolean searchNode(LinkedList list, int val){
		if(list.head == null){
			return false;
		}
		Node currentNode = list.head;
		while(currentNode != null){
			if(currentNode.data == val){
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(4);
		list.head.next.next = new Node(5);
		list.head.next.next.next = new Node(7);
		if(new SearchInLinkedList().searchNode(list, 4)){
			System.out.println("Element found");
		}else{
			System.out.println("Element not found");
		}

	}

}
