package com.indra.java.DataStructuresInJava.StacksAndQueues;

public class TwoStackUsingOneArray {
	int[] stackArray;
	int top1;
	int top2;
	int size;
	
	TwoStackUsingOneArray(int size){
		this.size = size;
		stackArray = new int[size];
		top1 = -1;
		top2 = size;
	}
	public void push1(int d){
		// check for space to insert element
		if(top1 < top2 -1){
			stackArray[++top1] = d;
		}
	}
	public void push2 (int d){
		if(top1 < top2-1){
			stackArray[--top2] = d;
		}
	}
	public int pop1(){
		//check if elements are there to pop
		if(top1 >= 0){
			int val = stackArray[top1--];
			return val;
		}
		return -1;
	}
	public int pop2(){
		if(top2 < size){
			int val = stackArray[top2++];
			return val;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		TwoStackUsingOneArray obj = new TwoStackUsingOneArray(10);
		obj.push1(1);
		obj.push1(2);
		obj.push1(3);
		obj.push2(10);
		obj.push2(9);
		obj.push2(8);
		System.out.println(obj.pop1());
		System.out.println(obj.pop2());
	}

}
