package com.indra.Trees;

/*Inseting values in BST using recursive approach*/

public class BinarySearchTree2 {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	//Recursive function to insert a value into BST
	public Node recursiveInsert(Node currentNode, int value) {
		//Base case
		if(currentNode == null) {
			return new Node(value);
		}
		if(value < currentNode.getData()) {
			//Iterate over left sub tree
			currentNode.setLeft(recursiveInsert(currentNode.getLeft(),value));
		}else if(value > currentNode.getData()) {
			currentNode.setRight(recursiveInsert(currentNode.getRight(), value));
		}else {
			return currentNode;
		}
		return currentNode;
	}
	
	public boolean insert(int value) {
		root = recursiveInsert(this.root, value);
		return true;
	}
	public void printTree(Node current) {
		if(current == null) return;
		System.out.println(current.getData() + ",");
		printTree(current.getLeft());
		printTree(current.getRight());
	}
	
	public static void main(String[] args) {
		BinarySearchTree2 bst = new BinarySearchTree2();
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
