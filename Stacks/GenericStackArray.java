package com.indra.ads.stacks;

/*
 * A stack is an abstract data structure which maintains Last In First Out order(LIFO).
 * Stack can implemented using Arrays and LinkedList.
 * Operations on stack are:
 * 
 * push(T data); // push element onto stack
 * pop(); // removes top element on the stack
 * peek(); // fetched top element on the stack
 * 
 * In case of Arrays stacks are not dynamic in nature like, in Linked list implementation,
 * we need to setup size at compile time.
 * 
 * If the stack size is growing, we need to resize the stack size double than before
 * and copy all old elements to new resized array which takes o(n) time.
 * 
 * There could be some scenarios where stack should be shrinked, if the size of stack
 * is one fourth of the stack capacity.
 * 
 * This stack array class is generic in nature which can take any data type. As java 
 * doesn't support generic arrays we need to use object array instead.
 * 
 * This implementation is memory friendly but not as fast like linked list implementation because of resizing operation.If we don't have to resize, push and pop
 * operation are O(1)
 * 
 * */

public class StackArray<T> {
	
	private T[] stack;
	private int numOfItems;
	
	public StackArray(){
		this.stack = (T[]) new Object[1];
	}
	
	public boolean isStackEmpty(){
		return numOfItems == 0;
	}
	
	public boolean isStackFull(){
		return numOfItems == stack.length;
	}
	
	public void push(T data){
		if(isStackFull()){
			resize(2* this.stack.length);
			
		}
		stack[numOfItems++] = data;
	}
	
	public T pop(){
		T popItem = null;
		if(!isStackEmpty()){
			popItem = this.stack[--numOfItems];
		}
		if(numOfItems > 0 && numOfItems == this.stack.length/4){
			resize(this.stack.length/2);
		}
		return popItem;
	}
	
	public T peek(){
		T peekItem = null;
		if(!isStackEmpty()){
			peekItem = this.stack[numOfItems - 1];
		}
		return peekItem;
	}
	
	// O(N) linear time complexity
	private void resize(int capacity){
		T[] stackCopy = (T[]) new Object[capacity];
		
		for(int i=0; i<numOfItems; ++i){
			stackCopy[i] = this.stack[i];
		}
		
		this.stack = stackCopy;
	}

	public static void main(String[] args) {
		
		StackArray<Integer> stack = new StackArray<Integer>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Peek element in stack " + stack.peek());
		System.out.println("Popped element from the stack is "+stack.pop());
		System.out.println("Peek element in stack " + stack.peek());
	}

}

o/p:
Peek element in stack 3
Popped element from the stack is 3
Peek element in stack 2

