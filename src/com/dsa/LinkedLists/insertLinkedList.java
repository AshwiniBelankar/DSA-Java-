package com.dsa.LinkedLists;

public class insertLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	
	public void insertAfter(Node prev_node,int new_data)
	{
		if(prev_node == null) {
			System.out.println("Previous Node is Null");
		}
		
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	public void append(int new_data) {
		
		Node new_node = new Node(new_data);
		if(head==null) {
			head = new Node(new_data);
			return;
		}
		
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
			
		}
		
		
	}
	
	public void printList() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
