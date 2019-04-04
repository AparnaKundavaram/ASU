// Testing the insert, remove, inorder, preorder and postorder methods.
package com.asu;

// Creation of test class.
public class Test {

	public static void main(String[] args) {
		
		BinarySearchTree myTree = new BinarySearchTree();
		
		myTree.setRoot(200);
		myTree.insert(myTree.getRoot(), 175);
		myTree.insert(myTree.getRoot(), 300);
		myTree.insert(myTree.getRoot(), 150);
		myTree.insert(myTree.getRoot(), 225);
		myTree.insert(myTree.getRoot(), 250);
		myTree.insert(myTree.getRoot(), 240);
		myTree.insert(myTree.getRoot(), 275);
		myTree.insert(myTree.getRoot(), 160);
		myTree.insert(myTree.getRoot(), 125);
		myTree.remove(myTree.getRoot(), 175);
		myTree.remove(myTree.getRoot(), 300);
		myTree.remove(myTree.getRoot(), 160);
		
		
	    System.out.println("Inorder Traversal");
        myTree.inOrder(myTree.getRoot());	
	    System.out.println("\nPreorder Traversal");
        myTree.preOrder(myTree.getRoot());
        System.out.println("\nPostorder Traversal");
        myTree.postOrder(myTree.getRoot());
	}
}
