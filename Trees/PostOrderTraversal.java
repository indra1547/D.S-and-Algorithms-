package com.indra.Trees;

public class PostOrderTraversal {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node recursiveInsert(Node currentNode, int value) {
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

	public boolean insert(int value) {
		root = recursiveInsert(this.root, value);
		return true;
	}

	public void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.println(root.getData() + ",");
	}

	public static void main(String[] args) {
		PostOrderTraversal BST = new PostOrderTraversal();
		BST.insert(6);
		BST.insert(4);
		BST.insert(2);
		BST.insert(5);
		BST.insert(9);
		BST.insert(8);
		BST.insert(12);
		BST.postOrder(BST.getRoot());
	}

}
