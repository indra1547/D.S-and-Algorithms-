package com.indra.Trees;

public class PreOrderTraversal {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public boolean insert(int value) {
		if(isEmpty()) {
			root = new Node(value);
			return true;
		}
		Node currentNode = root;
		while(currentNode != null) {
			Node leftChild = currentNode.getLeft();
			Node rightChild = currentNode.getRight();
			if(currentNode.getData() > value) {
				if(leftChild == null) {
					leftChild = new Node(value);
					currentNode.setLeft(leftChild);
					return true;
				}
				currentNode = leftChild;
			}
			else {
				if(rightChild == null) {
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
	public void preOrder(Node root) {
		if(root == null) return;
		System.out.println(root.getData()+ ",");
		preOrder(root.getLeft());
		preOrder(root.getRight());
		
	}
	public static void main(String[] args) {
		PreOrderTraversal BST = new PreOrderTraversal();
		BST.insert(6);
		BST.insert(4);
		BST.insert(2);
		BST.insert(5);
		BST.insert(9);
		BST.insert(8);
		BST.insert(12);
		BST.preOrder(BST.getRoot());
	}
}
