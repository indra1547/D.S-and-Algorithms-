package com.indra.CodingPatterns.DFS;
/*Given a binary tree and a number sequence, find if the sequence is present 
 * as a root-to-leaf path in the given tree.*/

public class IsSequencePresent {
	public static boolean isPresent(TreeNode root, int[] sequence) {
		if (root == null) {
			return sequence.length == 0;
		}
		return findPathRecursive(root, sequence, 0);
	}

	public static boolean findPathRecursive(TreeNode currentNode, int[] sequence, int sequenceIndex) {
		if (currentNode == null) {
			return false;
		}
		if (sequence[sequenceIndex] != currentNode.data || sequenceIndex >= sequence.length) {
			return false;
		}

		// if a current node is leaf node
		if (sequenceIndex == sequence.length - 1 && currentNode.left == null && currentNode.right == null) {
			return true;
		}
		return findPathRecursive(currentNode.left, sequence, sequenceIndex + 1)
				|| findPathRecursive(currentNode.right, sequence, sequenceIndex + 1);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(1);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(5);

		System.out.println("Tree has path sequence: " + IsSequencePresent.isPresent(root, new int[] { 1, 0, 7 }));
		System.out.println("Tree has path sequence: " + IsSequencePresent.isPresent(root, new int[] { 1, 1, 6 }));
	}

}
