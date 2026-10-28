package com.linkedListDoubly;

public class MainDoubleWork {
	public static void main(String[] args) {
		DoublyList d = new DoublyList();
		d.insertAtHead(19);
		d.insertAtHead(10);
		d.insertAtHead(20);
		d.printList();
		System.out.println(d.head.data);
		System.out.println(d.tail.data);
	}
}
