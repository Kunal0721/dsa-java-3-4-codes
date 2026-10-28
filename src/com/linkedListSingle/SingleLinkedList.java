package com.linkedListSingle;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class SingleLinkedList {
	Node head;

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);
		if (position < 0) {
			System.out.println("Invalid position...");
			return;
		}
		if (position == 0) {
			insertAtHead(data);
			return;
		}
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public int sum() {
		int sum = 0;
		Node temp = head;
		while (temp != null) {
			sum += temp.data;
			temp = temp.next;
		}
		return sum;
	}

	public int findMid() {
		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public Node reverse() {
		Node prev = null;
		Node current = head;
		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public int deleteAtHead() {
		Node temp = head;
		head = head.next;
		int popData = temp.data;
		temp = null;
		return popData;
	}

	public int deleteAtPosition(int position) {
		if (position < 0) {
			System.out.println("Invalid position..");
			return -1;
		}
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		int remove_data = temp.next.data;
		temp.next = temp.next.next;
		return remove_data;
	}

	public int deleteAtEnd() {
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		int popData = temp.next.data;
		temp.next = null;
		return popData;
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

}
