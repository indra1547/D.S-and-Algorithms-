package com.indra.CodingPatterns.BFS;

import java.util.*;

public class ReverseLevelOrderTraversal {
	public List<List<Integer>> reverseTraversal(TreeNode root){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null){
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> currentLevel = new ArrayList<>();
			for(int i = 0; i < size; i++){
				TreeNode currentNode = queue.poll();
				currentLevel.add(currentNode.data);
				if(currentNode.left != null){
					queue.offer(currentNode.left);
				}
				if(currentNode.right != null){
					queue.offer(currentNode.right);
				}
			}
			result.add(0, currentLevel);
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		List<List<Integer>> result = new ReverseLevelOrderTraversal().reverseTraversal(root);
		System.out.println(result);

	}

}
