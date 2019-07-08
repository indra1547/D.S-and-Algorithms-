package com.indra.CodingPatterns.DFS;
/*
 * Given a binary tree and a number ‘S’, find all paths from root-to-leaf 
 * such that the sum of all the node values of each path equals ‘S’.
 * */

import java.util.*;

public class AllPathSum {
	public List<List<Integer>> allPath(TreeNode root, int sum) {
		List<List<Integer>> allPaths = new ArrayList<List<Integer>>();
		List<Integer> currentPath = new ArrayList<Integer>();
		findPathRecursive(root, sum, currentPath, allPaths);
		return allPaths;
	}

	public void findPathRecursive(TreeNode currentNode, int sum, List<Integer> currentPath,
			List<List<Integer>> allPaths) {
		if (currentNode == null) {
			return;
		}
		currentPath.add(currentNode.data);
		// check if is leaf node and the summation condition
		if (currentNode.data == sum && currentNode.left == null && currentNode.right == null) {
			allPaths.add(new ArrayList<Integer>(currentPath));
		} else {
			// traverse left and right subtrees
			findPathRecursive(currentNode.left, sum - currentNode.data, currentPath, allPaths);
			findPathRecursive(currentNode.right, sum - currentNode.data, currentPath, allPaths);
		}
		// remove current node from path to backtrack
		currentPath.remove(currentPath.size() - 1);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		int sum = 23;
		List<List<Integer>> result = new AllPathSum().allPath(root, sum);
		System.out.println("Tree paths with sum " + sum + ": " + result);

	}

}
