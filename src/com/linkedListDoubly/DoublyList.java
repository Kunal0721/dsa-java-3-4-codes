package com.linkedListDoubly;

class Node {
	int data;
	Node next;
	Node prev;

	Node(int data) {
		this.data = data;
	}
}

public class DoublyList {
	Node head, tail;

	public void printList() {
		Node temp = head;
		System.out.print("null");
		while (temp != null) {
			System.out.print("<- " + temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
}
