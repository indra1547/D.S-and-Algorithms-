package com.indra.java.stacks;

public class Stack {
	int[] data = null;
	int top = -1;
	int capacity;

	Stack(int capacity) {
		this.capacity = capacity;
		this.data = new int[capacity];
	}

	public boolean push(int x) throws Exception {
		if (top > capacity) {
			throw new Exception ("Stack Overflow");
		}
		data[++top] = x;
		return true;
	}

	public int pop() throws Exception {
		if (top < 0) {
			throw new Exception ("No elements to pop out");
		}
		int x = data[top--];
		return x;
	}

	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(data[i]);

		}
	}

}
