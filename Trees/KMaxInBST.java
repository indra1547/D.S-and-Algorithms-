package com.indra.Trees;

/*In this problem, you have to implement the findKthMax() function to take a BST and any number “k” as an input, 
 * and return kth maximum number from that tree.*/

import java.util.ArrayList;
import java.util.List;

public class KMaxInBST {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public int findKMax(Node root, int k) {
		List<Integer> resultList = new ArrayList<Integer>();
		// sorting elements in tree in ascending order
		resultList = inOrderTraversal(root, resultList);
		int min = resultList.get(resultList.size() - k);
		return min;
	}

	public List<Integer> inOrderTraversal(Node root, List<Integer> resultList) {
		if (root.getLeft() != null) {
			inOrderTraversal(root.getLeft(), resultList);
		}
		resultList.add(root.getData());
		if (root.getRight() != null) {
			inOrderTraversal(root.getRight(), resultList);
		}
		return resultList;
	}

	public Node recursiveInsert(Node currentNode, int value) {
		// base case
		if (currentNode == null) {
			return new Node(value);
		}
		if (currentNode.getData() > value) {
			currentNode.setLeft(recursiveInsert(currentNode.left, value));
		} else if (currentNode.getData() < value) {
			currentNode.setRight(recursiveInsert(currentNode.right, value));
		} else {
			return currentNode;
		}
		return currentNode;
	}

	// function to trigger recursive call
	public boolean insert(int value) {
		root = recursiveInsert(this.root, value);
		return true;
	}

	public static void main(String[] args) {
		KMaxInBST bsT = new KMaxInBST();
		bsT.insert(6);
		bsT.insert(4);
		bsT.insert(9);
		bsT.insert(5);
		bsT.insert(2);
		bsT.insert(8);
		bsT.insert(12);
		bsT.insert(10);
		bsT.insert(14);
		System.out.println("Kth Max in BST tree is: " + bsT.findKMax(bsT.getRoot(), 3));

	}

}
