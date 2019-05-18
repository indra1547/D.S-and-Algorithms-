package com.indra.Trees;
/*Below snippet is operations on Binary Tree*/

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;

	TreeNode(int data) {
		this.data = data;
	}

	public void insert(int val) {
		/*If given value is less than root node, go to left sub tree*/
		if (val <= data) {
			/*If left sub tree is empty create a node*/
			if (left == null) {
				left = new TreeNode(val);
			} else {
				/*If it has node in left tree, insert new node on its left*/
				left.insert(val);
			}
		} else {
			/*If given value is greater than root node,navigate to right sub tree*/
			if (val >= data) {
				if (right == null) {
					right = new TreeNode(val);
				} else {
					right.insert(val);
				}
			}
		}
	}

	public boolean contains(int val) {
		/*If given value is found at root level*/
		if (val == data) {
			return true;
		} else if (val < data) {
			/*left sub tree*/
			if (left == null) {
				return false;
			} else {
				return left.contains(val);
			}
		} else {
			/*right sub tree*/
			if (right == null) {
				return false;
			} else {
				return right.contains(val);
			}
		}
	}
	
	public void inOrderTraverse() {
		/*left -> root -> right*/
		if(left != null) {
			left.inOrderTraverse();
		}
		System.out.println(data);
		if(right != null) {
			right.inOrderTraverse();
		}
	}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(10);
		node.insert(5);
		node.insert(15);
		node.insert(8);
		node.inOrderTraverse();
		if(node.contains(18)) {
			System.out.println("Contains: Yes");
		}else {
			System.out.println("Contains : No");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
