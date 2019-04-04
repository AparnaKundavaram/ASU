// Description: Implementation of List class for Single linked list.

package com.asu;

	public class List {
		private Node head;	//reference to first element of list
        
		// Creating the default constructor.
		
		public List() {
			this(null);
		}
		
		// Creating a constructor with the entry.
		
		public List(Node entry) {
			head = entry;
		}
        
		// Creating accessors and mutators.
		
		public Node getHead() {
			return head;
		}

		public void updateHead(Node head) {
			this.head = head;
		}
		
		/**
		 * insert a new node at the beginning of a list
		 * @param newNode
		 */
		public void insertAtBeginning(Node newNode) {
			if(head == null) {
				head = newNode;
			} else {
				newNode.updateNext(head);
				head = newNode;
			}
		}
		
		/**
		 * insert a new node at the end of a list
		 * @param newNode
		 */
		public void insertAtEnd(Node newNode) {
			Node current = head;
			boolean end = false;
			while(current != null && !end){
				if (current.getNext() == null) {
					current.updateNext(newNode);
					end = true;
				} else {
					current = current.getNext();
				}
			}	
		}
		
		/**
		 * 
		 */
		public boolean removeFromBeginning() {
			if (head == null) {
				return false;
			} else {
				head = head.getNext();
				return true;
			}
		}
		
		/**
		 * 
		 */
		public boolean removeFromEnd(){
			Node current = head;
			Node previous = current;
			while (current != null) 
			{
				previous = current;
				current = current.getNext();
				
				if (current.getNext() == null){
					if(previous == head)
					{
						head = null;
						previous = null;
						current = null;
						return true;
					}
					else
					{
					    previous.updateNext(null);
					    previous = null;
					    current = null;
					    return true;
					}
				}
			}
			return false;	
		}
		
		public void print(){
			Node current = head;
			System.out.println("List of the elements: ");
			while (current != null){
				System.out.println(current.getElement());
				current = current.getNext();
			}	
		}
		
		public boolean isEmpty(){
			if(head != null) {
				return false;
			}
			return true;
		}
	}