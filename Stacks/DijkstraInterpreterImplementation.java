package com.indra.ads.stacks;

import java.util.Stack;

/*
 * Dijkshtra Interpreter/ Shunting yard algorithm is a method to process mathematical
 * expressions. In this algo, one stack is used to store operators and other to 
 * store values. This algorithm is generalized into operator - precedence parsing
 * 
 * */

public class DijkstraInterpreterImplementation {
	
	private Stack<String> operationsStack;
	private Stack<Double> valueStack;
	
	DijkstraInterpreterImplementation(){
		this.operationsStack = new Stack<String>();
		this.valueStack = new Stack<Double>();
	}
	
	public void dijkshtraInterpreter(String expression){
		
		// split the given string based on white space;
		
		String[] splitExpression = expression.split(" ");
		for(String s : splitExpression ){
			if(s.equals("(")){
				// do nothing
			}else if (s.equals("+") || s.equals("*") || s.equals("-")){
				this.operationsStack.push(s);
			} else if (s.equals(")")){
				String operation = operationsStack.pop();
				
				if(operation.equals("+")){
					this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
				} else if(operation.equals("*")){
					this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
				}else if(operation.equals("-")){
					this.valueStack.push(- this.valueStack.pop() + this.valueStack.pop());
				}
			}else {
				valueStack.push(Double.parseDouble(s));
			}
		}
		
	}
	
	public void res(){
		System.out.println(this.valueStack.pop());
	}
	
	public static void main(String[] args) {
		
		String exp = "( ( 1 + 2 ) - ( 1 * 2 ) )";
		DijkstraInterpreterImplementation obj = new DijkstraInterpreterImplementation();
		obj.dijkshtraInterpreter(exp);
		obj.res();

	}

}
O/p: 1.0
