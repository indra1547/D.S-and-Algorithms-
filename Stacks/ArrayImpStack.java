package com.indra.java.stacks;

public class ArrayImpStack {

	public static void main(String[] args) throws Exception {
		Stack s = new Stack(10);
		s.push(1);
		s.push(3);
		s.push(5);
		s.push(100);
		s.push(1200);
		s.push(200);
		s.push(30);
		s.push(80);
		s.push(780);
		s.push(3030);
		s.push(390);
		s.pop();
		s.pop();
		s.printStack();
		
		
	}

}
