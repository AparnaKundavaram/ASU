// Creating package for node class.

package com.asu;

// Creating a class named as Node.

public class Node {
	private Node next;         // reference to first element of list.
	private int element;      // holding elements.
	
// Creating a constructor with specified parameters.
	
	public Node(int element , Node next)
	{
		this.element = element;
		this.next = next;
	}
	
// Creating a default constructor.
	
	public Node(int element)
	{
		this(element,null);
	}
	
// Creating accessors and mutators for the instance variables.
	
	public Node getNext() {
		return next;
	}
	public void updateNext(Node next) {
		this.next = next;
	}
	public int getElement() {
		return element;
	}
	public void updateElement(int element) {
		this.element = element;
	}
	
}
