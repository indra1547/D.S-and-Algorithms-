package com.indra.ads.queues;

/*
 * Queue is an abstract data type which follows FIFO property i.e First In First Out
 * 
 * Basic Operations in queue are:
 * 
 * 1. enqueue(T data) - adding element at tail/end of the queue
 * 2. dequeue() - removing element at beginning/front of the queue
 * 3. peek() - fetching element at front of the queue.
 * 
 * As Queue is an abstract data type, it can be implemented via arrays and linked list
 * 
 * Below is the linked list implementation
 * 
 * */

public class GenericQueueLinkedList<T extends Comparable<T>> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	int size;
	
	GenericQueueLinkedList(){
		this.firstNode = null;
		this.lastNode = null;
	}
	
	class Node<T>{
		T data;
		Node<T> next;
		
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty(){
		return this.firstNode == null;
	}
	
	// O(1)
	public void enqueue(T data){
		this.size++;
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(data);
		if(isEmpty()){
			this.firstNode = this.lastNode;
		}else{
			oldLastNode.next = this.lastNode;
		}
	}
	
	// O(1)
	public T dequeue(){
		this.size --;
		T removedNode = this.firstNode.data;
		this.firstNode = this.firstNode.next;
		return removedNode;
	}
	
	// O(1)
	public T peek(){
		return this.firstNode.data;
	}
	
	public int queueSize(){
		return this.size;
	}

	public static void main(String[] args) {
		GenericQueueLinkedList<Integer> obj = new GenericQueueLinkedList<Integer>();
		obj.enqueue(0);
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		System.out.println("Intial Queue size is " + obj.queueSize());
		System.out.println("Dequeue element " + obj.dequeue());
		System.out.println("Dequeue element " + obj.dequeue());
		System.out.println("Peek of the queue " + obj.peek());
		System.out.println("Queue size is " + obj.queueSize());
	}

}

o/p:

Intial Queue size is 5
Dequeue element 0
Dequeue element 1
Peek of the queue 2
Queue size is 3
