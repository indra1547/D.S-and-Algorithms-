package com.indra.CodingPatterns.DFS;
/*Given a binary tree and a number ‘S’, find if the tree has a path from 
 * root-to-leaf such that the sum of all the node values of that path equals 
 * ‘S’.*/

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTreePathSum {
	public boolean hasPath(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		// if node is leaf node and sum of path is s
		if (root.data == sum && root.left == null && root.right == null) {
			return true;
		}
		// recursively call to traverse the left and right sub-tree
		// return true if any of the two recursive call return true
		return hasPath(root.left, sum - root.data) || hasPath(root.right, sum - root.data);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		System.out.println("Tree has path: " + new BinaryTreePathSum().hasPath(root, 23));
		System.out.println("Tree has path: " + new BinaryTreePathSum().hasPath(root, 16));
	}

}
