package com.indra.ads.stacks;


/*
 * A stack is an abstract data structure which allows LIFO mechanism.
 * 
 * Following class is implementation of stack using Linked List;
 * 
 * Push(T data) -> Adding elements to the head of linked list O(1)
 * Pop() -> deleting value at head of linked list O(1)
 * peek() -> fetch element at head of LL O(1)
 * 
 * With LL implementation stacks are dynamic in nature, we need to adjust references
 * and keep adding elements at head of LL.
 * 
 * */

public class StackLinkedList<T> {
	
	public class Node{
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	
	 Node headNode;
	 int size;
	 
	 StackLinkedList(){
		 this.headNode = null;
		 this.size = 0;
	 }
	 
	 public boolean isEmpty(){
		 return this.headNode == null;
	 }
	 
	 public  void push(T data){
		this.size++;
		Node newNode = new Node(data);
		newNode.next = headNode;
		this.headNode = newNode;
	 }
	 
	 public T pop(){
		 if(isEmpty()){
			 return null;
		 }
		 T popedItem = this.headNode.data;
		 headNode = headNode.next;
		 size --;
		 return popedItem;
	 }
	 
	 public int size(){
		 return size;
	 }
	 
	 public T peek(){
		 return headNode.data;
	 }
	 
	 public static void main(String[] args) {
		 
		 StackLinkedList<Integer> stack = new StackLinkedList<Integer>();
		 stack.push(0);
		 stack.push(1);
		 stack.push(2);
		 stack.push(3);
		 stack.push(4);
		 System.out.println("Stack size " + stack.size());
		 System.out.println("Popped element from stack "+ stack.pop());
		 System.out.println("Stack size " + stack.size());

	}

}

o/p:

Stack size 5
Popped element from stack 4
Stack size 4

