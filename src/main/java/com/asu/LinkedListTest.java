// Description: Implementation of Single linked list by using Test.java.
package com.asu;
public class LinkedListTest {

	public static void main(String[] args) {
		
		// Creating object.
		List myList = new List(new Node(2));
		
		// Checking all the methods created in List class.
		
		myList.insertAtBeginning(new Node(1));
		myList.insertAtBeginning(new Node(6));
		myList.insertAtEnd(new Node(3));
		myList.insertAtEnd(new Node(4));
		myList.removeFromBeginning();
		myList.removeFromEnd();
						
		// Printing List.
		System.out.println("Head of the list: ");
		System.out.println(myList.getHead().getElement());
		
		myList.print();
		
		System.out.println("Inserting at beginning: ");
		for(int i = 0; i <= 50; i++){
			myList.insertAtBeginning(new Node(i));
			}
		myList.print();
	}   
}
