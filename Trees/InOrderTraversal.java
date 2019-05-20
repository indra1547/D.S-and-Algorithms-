package com.indra.Trees;

public class InOrderTraversal {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node recursiveInsert(Node currentNode, int value) {
		// base condition
		if (currentNode == null) {
			return new Node(value);
		}
		if (currentNode.getData() > value) {
			currentNode.setLeft(recursiveInsert(currentNode.getLeft(), value));
		} else if (currentNode.getData() < value) {
			currentNode.setRight(recursiveInsert(currentNode.getRight(), value));
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

	public void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.getLeft());
		System.out.println(root.data + ",");
		inOrder(root.getRight());
	}
	
	public static void main(String[] args) {
		InOrderTraversal BST = new InOrderTraversal();
		BST.insert(6);
		BST.insert(4);
		BST.insert(2);
		BST.insert(5);
		BST.insert(9);
		BST.insert(8);
		BST.insert(12);
		BST.inOrder(BST.getRoot());
	}

}
