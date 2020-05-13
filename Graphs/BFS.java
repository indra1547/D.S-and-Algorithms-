package com.indra.ads.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public static String bfs(Graph g, int source){
		
		String result = "";
		if(g.vertices < 1){
			return result;
		}
		int vertices = g.vertices;
		boolean[] visited = new boolean[vertices];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(source);
		visited[source] = true;
		// traverse while queue is empty
		while(!queue.isEmpty()){
			//dequeue a node/vertex from the queue and add it to result;
			int currentNode = queue.poll();
			result += String.valueOf(currentNode);
			Iterator<Integer> itr = g.adjacentList[currentNode].iterator();
			while(itr.hasNext()){
				int toNode = itr.next();
				if(!visited[toNode]){
					queue.offer(toNode);
					visited[toNode] = true;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Graph g = new Graph(6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(4, 5);
        System.out.println(bfs(g, 0));
	}

}

o/p: 012345
