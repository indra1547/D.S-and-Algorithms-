package com.indra.ads.graphs;

import java.util.Iterator;
import java.util.Stack;

public class DFS {
	
	public static String dfsTraversal(Graph g, int source){
		
		String result = "";
		int vertices = g.vertices;
		// To track all visited nodes, initial list is false
		boolean[] visited = new boolean[vertices];
		// to store adjacent nodes/vertices
		Stack<Integer> stack = new Stack<Integer>();
		// push the source to stack
		stack.push(source);
		while(!stack.isEmpty()){
			int currentNode = stack.pop();
			result += String.valueOf(currentNode);
			Iterator<Integer> itr = g.adjacentList[currentNode].iterator();
			while(itr.hasNext()){
				int v = itr.next();
				if(!visited[v]){
					stack.push(v);
					//visit the node
					visited[v] = true;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        System.out.println(dfsTraversal(g, 0));

	}

}
o/p: 02143
