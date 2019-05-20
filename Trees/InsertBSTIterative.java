package com.indra.Trees;

/*Inserting value into BST using iterative approach*/

public class BinarySearchTree1 {
	Node root;
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	/*Insert value in BST*/
	public boolean insert(int value) {
		/*If tree is empty, create a node and insert given value in tree*/
		if(isEmpty()) {
			root = new Node(value);
			return true;
		}
		/*starting from the root*/
		Node currentNode = root;
		/*Traversing the tree until valid position to insert a value*/
		while(currentNode != null) {
			Node leftChild = currentNode.getLeft();
			Node rightChild = currentNode.getRight();
			/*If given value is less than root navigate to left subtree, if it greater navigate to right sub tree*/
			if(currentNode.getData() > value) {
				/*If left sub tree is empty, create a node else then insert the value*/
				if(leftChild == null) {
					leftChild = new Node(value);
					currentNode.setLeft(leftChild);
					return true;
				}
				currentNode = leftChild;
			} else {
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
	/*To check tree is empty or not*/
	public boolean isEmpty() {
		return root == null;
	}
	public void printTree(Node current) {
		if(current == null) return;
		System.out.println(current.getData() + ",");
		printTree(current.getLeft());
		printTree(current.getRight());
	}
	public static void main(String[] args) {
		BinarySearchTree1 bst = new BinarySearchTree1();
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		bst.insert(4);
		bst.insert(5);
		bst.insert(6);
		bst.insert(7);
		bst.insert(8);
		bst.printTree(bst.getRoot());
	}
}
