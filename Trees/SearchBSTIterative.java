package com.indra.Trees;
/*Search for a value in BST using Iterative approach*/

public class SearchBST {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/* Search for a value in BST, using iterative approach */
	public Node searchBSTIterative(int value) {
		if (isEmpty())
			return null;
		Node currentNode = root;
		while (currentNode != null) {
			if (currentNode.getData() == value)
				return currentNode;
			if (currentNode.getData() > value) {
				currentNode = currentNode.getLeft();
			} else {
				currentNode = currentNode.getRight();
			}
		}
		System.out.println("Not found in tree");
		return null;
	}

	public boolean insert(int value) {
		/* If tree is empty, create a node and insert given value in tree */
		if (isEmpty()) {
			root = new Node(value);
			return true;
		}
		/* starting from the root */
		Node currentNode = root;
		/* Traversing the tree until valid position to insert a value */
		while (currentNode != null) {
			Node leftChild = currentNode.getLeft();
			Node rightChild = currentNode.getRight();
			/*
			 * If given value is less than root navigate to left subtree, if it greater
			 * navigate to right sub tree
			 */
			if (currentNode.getData() > value) {
				/* If left sub tree is empty, create a node else then insert the value */
				if (leftChild == null) {
					leftChild = new Node(value);
					currentNode.setLeft(leftChild);
					return true;
				}
				currentNode = leftChild;
			} else {
				if (rightChild == null) {
					rightChild = new Node(value);
					currentNode.setRight(rightChild);
					return true;
				}
				currentNode = rightChild;
			}
		}
		return false;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public static void main(String[] args) {
		SearchBST bst = new SearchBST();
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		bst.insert(4);
		bst.insert(5);
		bst.insert(6);
		bst.insert(7);
		bst.insert(8);
		Node temp = bst.searchBSTIterative(71);
		while (temp != null) {
			System.out.println(temp.getData() + " found in Tree !");
			return;
		}

	}

}
