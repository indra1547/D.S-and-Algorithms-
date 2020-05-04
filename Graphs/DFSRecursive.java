package com.indra.ads.graphs;

import java.util.LinkedList;

public class DFSRecursive {
	
	public void DFSRecursive(int start, Graph g){
		LinkedList<Integer>[] tempList = g.adjacentList;
		int vertices = g.vertices;
		boolean[] visited = new boolean[vertices];
		dfs(start, visited,tempList);
	}

	// Recursive call
	public void dfs(int start, boolean[] visited, LinkedList<Integer>[] tempList) {
		visited[start] = true;
		System.out.println(start + " ");
		for(int i = 0; i < tempList[start].size(); i++){
			int toNode = tempList[start].get(i);
			if(!visited[toNode]){
				dfs(toNode, visited, tempList);
			}
		}
		
	}

	public static void main(String[] args) {
		Graph g = new Graph(6);
		 g.addEdge(0, 1);
	     g.addEdge(0, 2);
	     g.addEdge(1, 3);
	     g.addEdge(1, 4);
	     g.addEdge(2, 5);
        DFSRecursive obj = new DFSRecursive();
        obj.DFSRecursive(0, g);
	}

}
o/p: 
0 
1 
3 
4 
2 
5 
