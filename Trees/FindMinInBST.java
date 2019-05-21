package com.indra.Trees;
/* Find minimum value in Binary Search Tree */

public class FindMinInBST {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
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

	// function to find min value in BST
	public int finMin(Node root) {
		while (root.getLeft() != null) {
			root = root.getLeft();
		}
		return root.getData();
	}

	public static void main(String[] args) {
		FindMinInBST bsT = new FindMinInBST();
		bsT.insert(6);
		bsT.insert(4);
		bsT.insert(9);
		bsT.insert(5);
		bsT.insert(2);
		bsT.insert(8);
		bsT.insert(12);
		bsT.insert(10);
		bsT.insert(14);
		System.out.println("Min value in BST: " + bsT.finMin(bsT.getRoot()));
	}

}
