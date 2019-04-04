//Author : Aparna Makthedar Kundavaram
//ASU ID : 50519297
//Assignment : #HW07 & #HW08
//Course Title : Accelerated OOP and Fun Data Structures
//Course Code : CS5022
//Course Section : 002
//Due Date: Monday, 4/10/2017.
//Instructor: Mr. Jake A Qualls.
//Description: Implementation of Binary search tree and traversal methods. This includes the node class, BST class, Preorder, Inorder and Postorder methods.

//Creating a package BST.
package com.asu;

//Creating a class BinarySearchTree.
public class BinarySearchTree {
//an inner class. (Since because it is a class inside a class)
	public static class Node {
		private int value;        // Instant variables creation.
		private Node left;
		private Node right;
		
		public Node(int value) {  // Parameterized constructor.
			this.value = value;
			left = right = null;
		}

//Creation of accessors and mutators for value, left and right.
		public int getNodeValue() {
			return value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}
	private Node root;          // Creation of root.
	
//Creation of accessors and mutators for root.
	public Node getRoot() {
		return root;
	}

	public void setRoot(int value) {
		root = new Node(value);
	}
	
//Creating the class BinarySearchTree and root value is initialized to null. 
	public BinarySearchTree() {
		root = null;
	}
	
//Implementation of insert method.
	public void insert(Node n, int value) {
		if (n == null) {
			// my tree is empty
			this.setRoot(value);
		} else if(value < n.getNodeValue()) {
			// insert left
			if(n.getLeft() != null) {
				insert(n.getLeft(), value);
			} else {
				n.setLeft(new Node(value));
				}
		} else {
			// insert right
			if(n.getRight() != null) {
				insert(n.getRight(), value);				
			} else {
				n.setRight(new Node(value));
			}
		}
	}
     	
//Implementation of InOrder method. (LNR)
	public void inOrder(Node n) {
		if (n != null) { 
			inOrder(n.left);
			System.out.print(n.value + " ");
			inOrder(n.right);
		}
	}
	
//Implementation of PreOrder method. (NLR)
	public void preOrder(Node n) {
		if (n != null) { 
			System.out.print(n.value + " ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	
//Implementation of PostOrder method. (LRN)
	public void postOrder(Node n) {
		if (n != null) { 
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.value + " ");
		}
	}    	

//Method calling remove()
 public void Find(int value)
 {
      root = remove(root, value);
 }

//Implementation of remove method.
 public Node remove(Node n, int value)
 {
     //If the tree is empty.
     if (n == null) {
     	return n;
     }
     // If the tree is not empty.
     if (value < n.value){
         n.left = remove(n.left, value);
     }else if (value > n.value) {
         n.right = remove(n.right, value);

     // If the value is same as node's value.
     }else
     {
     // In the case of node with one child or leaf.
         if (n.left == null){
             return n.right;
         }else if (n.right == null){
             return n.left;
         } 
     // In the case of node with two children.
         n.value = minValue(n.right);

     // Removing.
         n.right = remove(n.right, n.value);        }

     return n;
 }

//Searching for minimum value.
 public int minValue(Node n)
 {
     int min = n.value;
     while (n.left != null)
     {
         min = n.left.value;
         n = n.left;
     }
     return min;
 }
}
